# JavaFX FXML Project — How to Run

## Requirements

- **JDK 21+** installed
- **JavaFX SDK 26** downloaded and extracted to `C:\javafx-sdk-26\`
- **VS Code** with the **Extension Pack for Java** installed

---

## Project Structure

```
FinanceStorage/
├── .vscode/
│   ├── launch.json
│   └── settings.json
├── src/
│   └── main/
│       ├── java/com/example/
│       │   ├── MainApp.java
│       │   └── HelloController.java
│       └── resources/com/example/
│           └── hello-view.fxml
└── out/   ← compiled output goes here
```

---

## Step 1 — Compile the Project

Open a terminal in VS Code (`Ctrl + `` ` ``) and run:

```cmd
javac --module-path "C:\javafx-sdk-26\lib" --add-modules javafx.controls,javafx.fxml -d out src/main/java/com/example/MainApp.java src/main/java/com/example/HelloController.java
```

This compiles your `.java` files into `.class` files inside the `out/` folder.

---

## Step 2 — Copy the FXML Resource

```cmd
xcopy /s /i src\main\resources\com\example out\com\example
```

This copies `hello-view.fxml` into the correct location inside `out/` so the app can find it at runtime.

---

## Step 3 — Run the App

```cmd
java --module-path "C:\javafx-sdk-26\lib" --add-modules javafx.controls,javafx.fxml -cp out com.example.MainApp
```

---

## Alternative — Run with F5 in VS Code

Make sure `.vscode/launch.json` contains:

```json
{
  "version": "0.2.0",
  "configurations": [
    {
      "type": "java",
      "name": "Run JavaFX App",
      "request": "launch",
      "mainClass": "com.example.MainApp",
      "vmArgs": "--module-path \"C:\\javafx-sdk-26\\lib\" --add-modules javafx.controls,javafx.fxml"
    }
  ]
}
```

Then press **F5** to compile and run automatically.

---

## Fix Red Squiggles in VS Code (IntelliSense)

If VS Code shows red underlines on `Scene`, `Stage`, etc., create `.vscode/settings.json`:

```json
{
  "java.project.referencedLibraries": [
    "C:\\javafx-sdk-26\\lib\\*.jar"
  ]
}
```

Then reload VS Code with `Ctrl + Shift + P` → **Reload Window**.

---


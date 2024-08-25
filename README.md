# Project Nutriknight

## Project Documents
  - [Ideas in Google Sheets](https://docs.google.com/spreadsheets/d/1JL2lT3-iV1pcSHnnSn6LNvD-OqF8wrZmOC1o8gGfeYQ/edit?gid=0#gid=0)
  - [Nutriknight Analysis & Design in Milanote](https://app.milanote.com/1RQHCm1tIffiev/nutriknights) 

## Setup SSH keys (on Mac or Windows)
Follow these instructions: https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent
  - Make sure you use your email address that is tied to the Github account
  - Just hit `Enter` for all prompts to use the defaults.
  - Don't use any passphrase. Press Enter when prompted for passphrase.
  - When setting up your ssh config (in `~/.ssh/config`), omit/remove the "UseKeychain" line
  - You don't need to follow the steps in the section, "Generating a new SSH key for a hardware security key"

## Add SSH Keys to Github Account (using the browser)
Follow these instructions: https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account
  - If you don't follow all the instructions here, you won't be able to pull the source files

## Pull source from Github
  - Open a Terminal/Commandline prompt
  - Change to `Projects/` folder in your home dir
  - If you already have a `nutriknight` folder under `Projects/`, delete it first 
  - Execute the following command: `git clone git@github.com:shashivelur/nutriknight.git`
  - You should have the folder nutriknight created under Projects. 

## Open the Nutriknight Project in IDE
  - Open IntelliJ IDE Community Edition app on your machine
  - IntelliJ IDE > File > Open > Navigate to `nutriknight` folder and open it

## Project source code
  - Look at the existing pattern for Boba tea under `src/main/java` and follow the same
  - Create your own packages/folders (like `drinkworld`) under `src/main/java/org/nk/` and add your java files there

## To create a new 16x16 pixel texture
  - Go to [https://www.pixilart.com](https://www.pixilart.com) and click on "New Drawing"
  - Go to `File` > `Resize Canvas` > Set Canvas size to 16x16 (`width` = 16 and `length` = 16)
  - Create your texture masterpiece by using pixels with different colors that represents your texture
  - After you're done, go to `File` > `Export/Download` > Download PNG
  - Rename the file in your `Downloads` folder to the same name as your item and copy it to your `~/Projects/nutrinight/src/main/resources/assets/nutriknight/textures/item/` folder

## Reference : Nutriknight Minecraft Project specifics
ModId: `nutriknight`
Root Package name: `org.nk.Nutriknight`
Minecraft version: `1.21.1`
Loom Version: `1.6.12`
Loader Version: `0.16.2`
Yarn Version: `1.21.1+`

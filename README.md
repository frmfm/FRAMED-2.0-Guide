# Contents


0. Introduction
1. [Artwork Development](#1-artwork-development)
	- 1-1. [FRAMED Summary](#1-1-framed-summary)
	- 1-2. [Still Artworks](#1-2-still-artworks)
	- 1-3. [Video Artworks](#1-3-video-artworks)
	- 1-4. [Application(EXE) Artworks](#1-4-applicationexe-artworks)
	- 1-5. [Flash(SWF) Artworks](#1-5-flashswf-artworks)
	- 1-6. [OpenFrameworks Artworks](#1-6-openframeworks-artworks)
	- 1-7. [Processing Artworks](#1-7-processing-artworks)
	- 1-8. [VVVV Artworks](#1-8-vvvv-artworks)
	- 1-9. [Cinder Artworks](#1-9cinder-artworks)
	- 1-10. [MaxMSP Artworks](#1-10maxmsp-artworks)
	- 1-11. [Web(Javascript) Artworks](#1-11webjavascript-artworks)
2. [Artist/Artwork Information (Upload Form)](#2-artistartwork-information-upload-form)
3. [FRAMED 2.0 Feed for Users](#3-framed-20-feed-for-users)
4. [Artwork License Contract/Determining Price & Edition Copies](#4-artwork-license-contractdetermining-price--edition-copies)
5. [Release/Sales](#5-releasesales)
6. [Guide for Organisations](#6-guide-for-organisations)
7. [Guide to Exhibiting with FRAMED](#7-guide-to-exhibiting-with-framed)
	

# 0. Introduction

FRAMED offers a number of different ways to submit your artworks to the platform. From applications for Windows (.exe) to web pages, it has never been easier to share and collect digital art. 

This document is designed to inform you on the basic technical specifications for creating an artwork, as well as the flow of listing and selling your content via FRAMED. When creating and selling artwork on FRAMED, please make sure to read this guide carefully.

## Step 1. Artwork Development & Testing

Artist will be responsible for the actual development of the artwork. The artwork can be of any type and category, including but not limited to Video/Graphic/Interactive. When the artwork has been developed, please submit your files via the online upload feature on the FRAMED website. Our team will test your artwork on the actual device, and will report back if there are any issues with your artwork. Testing and reporting phase will continue until the artwork is optimized.

## Step 2. Artwork/Artist Information

When artwork testing/debug/optimization has been completed, your artwork will be submitted to the public and you will receive a notification stating that your artwork is now available on FRAMED.


## Step 3. Information about your Artwork.

Please describe your artwork not only how it was inspired but also how it works. Whether it requires any interaction, uses camera, microphone, etc. 

When preparing the video, we made some graphic material available that will help.

1. [FRAMED logos](https://www.dropbox.com/s/nys55hixgr6uuyx/FRAMED%20Logos.ai?dl=0)
2. [PSD Template for your video](https://www.dropbox.com/s/3bsolt9jsowi646/framed_video_template.psd?dl=0)
3. [Reflection image positioned over your artwork in the video](https://www.dropbox.com/s/vegtxututr2ajwo/framed_video_template_reflection.png?dl=0)

For examples, see [our page on YouTube](https://www.youtube.com/user/FRAMEDofficial/videos).


## Step 4. Artwork License Contract/Pricing & Editions

Before the artwork is listed and released to the public, the Artwork licensing contract will be signed. Also, price of the artwork and the number of release issues/editions will be determined. These details are set by the artist during the upload process.

## Step 5. Artwork Submission

It is important that before you upload your files they are correctly stored and named in the .zip. FRAMED platform requires all launch/main files to be in the root of the zip. Please read below about how to correctly name your files for each framework/file format. 

[See this video for correctly zipping your files](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be).

Submission form supported artwork file formats:

- **EXE** - self contained .exe apps, Flash, openFrameworks, MaxMSP
- **VVVV** - VVVV framework for creative code
- **VIDEO** - Video files
- **PROCESSING** - Processing.org made 32bit .EXE application
- **IMAGE** - coming soon

<iframe width="560" height="315" src="https://www.youtube.com/embed/4DVss7Qa2Dg" frameborder="0" allowfullscreen></iframe>

## Step 6. Artwork Launch/Sale Begins

After all the information has been received and artwork has been tested, the artwork will be released to the public to begin sales on the FRAMED GALLERY. Updates will be released through the FRAMED Website and News Release. Artist will be able to check the current sales status through our website. As per the license contract, proceeds of the artwork sales will be distributed every three months.

# 1. Artwork Development


## 1-1. FRAMED Summary

• FRAMED is based on Windows 8 OS. Any work playable on a Windows 8 PC with equal specifications listed below will be able to play on the FRAMED device.

• FRAMED 2.0 Specification:

1. 24-inch = 21” x 12.4”, 8.8lb. (533 x 317, 4kg) 
2. 40-inch = 38” x 21.6”, 26.5lb. (976 x 550, 12kg)
3. 55-inch = 50” x 29”, 77lb. (1270 x 741, 35kg)

- Intel(R) Atom(TM) CPU Z3370 @ 1.46Ghz (spec)
- Intel HD Graphics (integrated) / Intel HD Gen 7
- Installed Memory (RAM) 2.00Gb
- System Type: 32-bit Windows Embedded 8 Operating System, x64-based processor
- Storage: 64 GB eMMC
- Current Mode: 1080 x 1920 (32 bit) (59Hz)
- Display Memory: 1513 MB
- Speakers (Intel SST Audio Device (WDM))
- Microphone (Intel SST Audio Device (WDM))
- HD Camera 720p

• All artworks will be displayed at W1080*H1920 pixel in full screen.

• Artworks can also optionally include the use of webcam/mic that are embedded on the device.

• As the device will be always connected to the internet, artists are also free to use the web as an additional input source for the artwork.

• FRAMED also supports playback of artworks from the web but if you wish to  sell web based artworks you need to follow the official submission feature. 

## 1-2. Still Artworks

For artists who work with the still/GIF image media, our system will package and release the submitted photo data into a playable artwork.

### ■ Supported File Format

Include JPG, GIF, Animated GIF, PNG, TIFF

### ■ Resolution

The artwork will be displayed at W1080 * H1920 Full HD format. Any work created at a lower resolution will be stretched. FRAMED also supports landscape format and this option is included during the upload.

### ■ Playback Format

The basic format for playing back the GIF artwork is the “infinity loop.” However, there are other ways to program the artwork for different playback formats if they are packaged as applications (see guides for other frameworks below). For example:

• Randomly selecting sections

• Time/Clock based (content changes according to the time of day)

• Interactive playback (content changes according to environment, i.e. sound and/or human presence)

### ■ Artwork Submission

• Please submit all files listed below in one folder .zip file (in the root, no subfolders). [Watch this video.](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be)

## 1-3. Video Artworks

For artists who work with the video media, our system will package and release the submitted video/photo data into a playable application. Please **note the file name** otherwise your movie won't be able to be played.

### ■ Resolution

The artwork will be displayed at W1080 * H1920 Full HD format. Any work created at a lower resolution will be stretched. FRAMED also supports landscape videos and this option is included during the upload.

### ■ Frame Rate

The highest frame rate is 30FPS.

### ■ Playback Format

The basic format for playing back the artwork is the “infinity loop.” However, there are other ways to ‘program’ the artwork for different playback formats if they are packaged as applications (see guides for other frameworks below). For example:

• Randomly selecting sections

• Time/Clock based (content changes according to the time of day)

• Interactive playback (content changes according to environment, i.e. sound and/or human presence)

### ■ Submission of Artwork

• For video artwork, please submit the data as a Quicktime (.mov) in one folder .zip file (in the root, no subfolders). [Watch this video.](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be)

• <span style="color:red;">**Your movie file must be named "main.mov"**</span>

• Please encode in H.264, unless otherwise specified.

• If the artwork requires special or unique playback format, we may additionally request other versions such as uncompressed data.

## 1-4. Application(EXE) Artworks

This category is related to all other than the frameworks listed below. These include Windows specific applications such as those made using Unity, Unreal Engine, etc.

### ■ Resolution

• The screen will display at W1080*H1920 pixels resolution. Please be aware of this resolution when developing your artwork.

### ■ Continuous Playback Time

• Any artwork application on FRAMED will be exposed to being played at maximum 24 hours for continuous playback (the device is programmed to automatically restart once a day). Please test to make sure that the artwork can be played continuously for 24 hours before submission.

• Please debug and optimize the artwork as much as possible, being careful of memory leakage.

• If we detect any malfunctions after the artwork has been released to the public, the artist will be responsible for modifying/updating the artwork as per the license contract. Please review the details the article 4-1 of the contract.

### ■ Artwork Submission

• Please submit all files listed below in one folder .zip file (in the root, no subfolders except for other related project files). [Watch this video.](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be):

- Main file must be named "main.exe".

- All other related files (SWF/text/images/sound)

• Specify file locations as relative paths.

• Do not include fullscreen commands (fscommand (“fullscreen”, “true”). This will be done automatically on the FRAMED device.


## 1-5. Flash(SWF) Artworks

This section is for artworks developed in Flash. Please review the instructions below, and submit your work in the specified format. Our development team will review and test your artwork.

### ■ Resolution

• The screen will display at W1080*H1920 pixels resolution. Please be aware of this resolution when developing your artwork.

• Hardware Scaling (scaling through hardware) function is enabled. Use this option to optimize the performance if there is trouble achieving reasonable frame rate.

### ■ Frame Rate

• Artworks can be played at any specified frame rate.

• Depending on the CPU load, the frame rate may drop. To make the testing process easier, please include a debug option to display the FPS where possible.

### ■ Hardware Acceleration

• Hardware Acceleration in Flash is enabled at default. Functions such as Stage3D that uses GPU power is also available http://www.macromedia.com/support/documentation/en/flashplayer/help/help01.html.

• However, there have been reports of bugs caused when Hardware Acceleration is enabled. If this is the case, Hardware Acceleration can be explicitly turned off.

### ■ Continuous Playback Time

• Any artwork application on FRAMED will be exposed to being played at maximum 24 hours for continuous playback (the device is programmed to automatically restart once a day). Please test to make sure that the artwork can be played continuously for 24 hours before submission.

• Please debug and optimize the artwork as much as possible, being careful of memory leakage.

• If we detect any malfunctions after the artwork has been released to the public, the artist will be responsible for modifying/updating the artwork as per the license contract. Please review the details the article 4-1 of the contract.

### ■ Artwork Submission

• Please submit all files listed below in one folder .zip file (in the root, no subfolders except for other related project files). [Watch this video.](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be):

- Projector file (main.exe) for Windows startup

- All other related files (SWF/text/images/sound)

• Specify file locations as relative paths.

• Do not include fullscreen commands (fscommand (“fullscreen”, “true”). This will be done automatically on the FRAMED device.

### ■ Camera/Mic

• Access to the internal webcam and mic embedded at the bottom of the screen is enabled at default. The maximum FPS/Resolution for the camera is: 30FPS/W1280*H720 pixels.

• The default format for the camera in the PC is read in horizontal, landscape mode. As such, when the work is displayed at fullscreen with the same aspect ratio, sides of the image may be trimmed.

• Access to the camera/mic from the flash player is enabled at default, and doesn’t require additional settings.

## 1-6. OpenFrameworks Artworks

### ■ Resolution

The screen will display at W1080*H1920 pixels resolution. Please be aware of this resolution when developing your artwork. Currently, display scaling is not supported.


### ■ Frame Rate

• Artworks can be played at any specified frame rate.

• Depending on the CPU load, the frame rate may drop. To make the testing process easier, please include a debug option to display the FPS where possible.


### ■ Camera/Mic

• Access to the internal webcam and mic embedded at the bottom of the screen is enabled at default. The maximum FPS/Resolution for the camera is: 30FPS/W1280*H720 pixels.

• The default format for the camera in the PC is read in horizontal, landscape mode. As such, when the work is displayed at fullscreen with the same aspect ratio, sides of the image may be trimmed.


### ■ Continuous Playback Time

• Any artwork application on FRAMED will be exposed to being played at maximum 24 hours for continuous playback (the device is programmed to automatically restart once a day). Please test to make sure that the artwork can be played continuously for 24 hours before submission.

• Please debug and optimize the artwork as much as possible, being careful of memory leakage.

• If we detect any malfunctions after the artwork has been released to the public, the artist will be responsible for modifying/updating the artwork as per the license contract. Please review the details the article 4-1 of the contract.

### ■ Artwork Submission

• Please submit all files listed below in one folder .zip file (in the root, no subfolders except for other related project files). [Watch this video.](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be):

- Main file must be named "main.exe".

- All other related files (/text/images/sound)

• Specify file locations as relative paths.

• Do not include fullscreen commands (fscommand (“fullscreen”, “true”). This will be done automatically on the FRAMED device.

### ■ Areas to Adjust for FRAMED

• Turn off console window

``#pragma comment(linker, "/subsystem:\"windows\" /entry:\"mainCRTStartup\"")``

• Resetting program path
We’ve noticed instances where the current directory is changed when the program is called from the FRAMED Shell. Please include the following code inside init main() of main.cpp, so that the program resources such as images and movie files can be accessed.

``char cdir[MAX_PATH], drive[MAX_PATH],dir  [MAX_PATH];
GetModuleFileNameA( NULL, cdir, MAX_PATH );
_splitpath(cdir,drive,dir,NULL,NULL);
sprintf_s(cdir,"%s%s",drive,dir);
SetCurrentDirectoryA(cdir);``

• FRAMED FullScreen settings

Windows default display is 16:9 horizontal (landscape), which FRAMED rotates to display as vertical (portrait) mode. As such, some adjustments are necessary to display OpenFrameworks at fullscreen. Please include the following code inside init main() in main.cpp.

Make sure that any window control functions like SetFullscreen(), ofSetWindowShape() (including Windows API) are not called from the application.

``ofSetupOpenGL(&window, 1080,1920, OF_WINDOW);
HWND hwnd = WindowFromDC(wglGetCurrentDC());
ChangeDisplaySettings(NULL, 0);
SetWindowLong(hwnd, GWL_STYLE,WS_VISIBLE ^ WS_OVERLAPPEDWINDOW ^WS_TILEDWINDOW);
SetWindowPos(hwnd, HWND_TOPMOST,0,1,1080,1920,SWP_NOZORDER);
SetWindowPos(hwnd, HWND_TOPMOST,0,0,0,0,SWP_NOSIZE|SWP_NOMOVE|SWP_FRAMECHANGED|SWP_NOZORDER);``

• * We are currently not aware of any other special requirements, however we will continue to let release updates where possible.

## 1-7. Processing Artworks

### ■ Frame Rate

• Artworks can be played at any specified frame rate.

• Depending on the CPU load, the frame rate may drop. To make the testing process easier, please include a debug option to display the FPS where possible.

### ■ Camera/Mic

• Access to the internal webcam and mic embedded at the bottom of the screen is enabled at default. The maximum FPS/Resolution for the camera is: 30FPS/W1280*H720 pixels.

• The default format for the camera in the PC is read in horizontal, landscape mode. As such, when the work is displayed at fullscreen with the same aspect ratio, sides of the image may be trimmed.

• Access to the camera/mic from the flash player is enabled at default, and doesn’t require additional settings.

### ■ Artwork Submission

• Resolution of your artwork should be set as size(1080,1920);

• Include [noCursor()](https://processing.org/reference/noCursor_.html) to hide cursor in your application

• Export your sketch from Processing as a 32-bit Windows Application.

• Enable full screen

• Please submit all files in one folder .zip file with a .exe in the root (no subfolders except for data and other related sketch files). [Watch this video.](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be).


## 1-8. VVVV Artworks

### ■ Download the Templates

• Templates in either DX9 or DX11 are available from [VVVV website](http://vvvv.org/contribution/framed-template). Choose between either DX9 or DX11.

### ■ Packaging the Artworks

• The root patch started by the Framed is: main.v4p

• Target: vvvv45_beta33.7_x86 + addonpack + DX11 pack

The Framed will run your Renderer fullscreen by using the "/fullscreen 1" commandline parameter. The Framed (Devices) module (part of this template) takes care of this.

When creating your patches please keep the rather low hardware specifications of the device in mind. The demo coming with this template runs at ~60fps. Note, that Antialiasing of the Renderer is deliberately set to the minimum to gain such performance.

### ■ Artwork Submission

• Please submit files in one folder .zip file with a "main.v4p" in the root (no subfolders except for other related project files). [Watch this video.](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be)

### ■ Camera/Mic

• Access to the internal webcam and mic embedded at the bottom of the screen is enabled at default. The maximum FPS/Resolution for the camera is: 30FPS/W1280*H720 pixels.

• The default format for the camera in the PC is read in horizontal, landscape mode. As such, when the work is displayed at fullscreen with the same aspect ratio, sides of the image may be trimmed.

• Access to the camera/mic from vvvv is enabled at default, and doesn’t require additional settings.

## 1-9.Cinder Artworks

• More information to be added soon

## 1-10.MaxMSP Artworks

MAX 7.0 and above is supported since it eliminates need for seperate runtime and artworks can be packaged as standalone .EXE files.

### ■ Frame Rate

• Artworks can be played at any specified frame rate.

• Depending on the CPU load, the frame rate may drop. To make the testing process easier, please include a debug option to display the FPS where possible by using keyboard commands.

### ■ Camera/Mic

• Access to the internal webcam and mic embedded at the bottom of the screen is enabled at default. The maximum FPS/Resolution for the camera is: 30FPS/W1280*H720 pixels.

• The default format for the camera in the PC is read in horizontal, landscape mode. As such, when the work is displayed at fullscreen with the same aspect ratio, sides of the image may be trimmed.

• Access to the camera/mic is enabled at default, and doesn’t require additional settings.

### ■ Artwork Submission

• Resolution of your artwork should be set as size(1080,1920);

• FRAMED supports MAX 7.0 and above since it eliminates the need for a separate Max runtime. Any Max patch can be exported as a ’standalone’ application, which integrates the runtime and other necessary components. 

• Main file must be named "main.exe".

• Enable full screen

• Launch directly with render screen, hiding the Max patch window.

• Please submit all files in one folder .zip file with a .exe in the root (no subfolders except for data and other related files). [Watch this video.](https://www.youtube.com/watch?v=4DVss7Qa2Dg&feature=youtu.be)

## 1-11.Web(Javascript) Artworks

• More information to be added soon


# 2. Artist/Artwork Information (Upload Form)

All artworks sold on FRAMED will be released on the artwork store, FRAMED GALLERY, as well as through our official website. Please prepare and submit below information regarding the Artwork and the Artist. Please write in your own language; we will provide the necessary English/Japanese translation.

# 3. FRAMED 2.0 Feed for Users

# 4. Artwork License Contract/Determining Price & Edition Copies

• Before releasing and selling the artwork on FRAMED, Artwork License Contract will need to be read and signed by both parties. Please read the contract below thoroughly.

License Contract (JP)　License Contract (EN)


### ■ DRM/Edition/Artwork Price

• To make sure that the artwork retains its value, FRAMED uses DRM to protect each work. Artwork data will be encoded and stored on the FRAMED device itself. Also, information of the artwork owner will be registered on the database as collateral to secure ownership.

• As per above, we use the concept of ‘editions (issued copies of the artwork)’ for each artwork released on FRAMED. Artists can, with discussion and consultation with our company, determine his/her own artwork price and editions.

• However, at least during the beginning phases, we aim to create a healthy ecosystem for our FRAMED artwork market where “high quality content is released in limited numbers (editions) for a privileged price, compared to the current standards of digital content.” For this reason, we currently hold a benchmark of “1 artwork: 31,500 yen x 100 editions.” An artist should take this into account when thinking about his/her own artwork pricing/editions.

# 5. Release/Sales

As soon as the artwork is uploaded, the artwork will be tested and if all checked OK it listed and sold through the FRAMED GALLERY. Information will also be released through the FRAMED Website and News Release.

When an artwork is sold, the artist will be notified through an email sent to the registered email address. Furthermore, up to date sales information and status is available for viewing at any time on our website. As per the license contract, proceeds will be distributed every 3 months.

Further details will follow shortly, so please be sure to check back for updates.

# 6. Guide for Organisations

• More information to be added soon

# 7. Guide to Exhibiting with FRAMED

FRAMED devices, offered in 24”, 40” and 55” sizes make a great exhibition device since they are self-contained, all-in-one PCs and require not additional hardware to display artworks. With integrated camera and microphone, they allow interaction with visitors and the online platform can serve conveniently to deploy artworks straight to the exhibition space. 

• More information to be added soon
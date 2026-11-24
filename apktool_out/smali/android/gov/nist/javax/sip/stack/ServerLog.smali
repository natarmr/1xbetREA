.class public Landroid/gov/nist/javax/sip/stack/ServerLog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/core/ServerLogger;


# instance fields
.field private auxInfo:Ljava/lang/String;

.field private configurationProperties:Ljava/util/Properties;

.field private description:Ljava/lang/String;

.field private logContent:Z

.field private logFileName:Ljava/lang/String;

.field private printWriter:Ljava/io/PrintWriter;

.field private sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

.field private stackIpAddress:Ljava/lang/String;

.field protected stackLogger:Landroid/gov/nist/core/StackLogger;

.field protected traceLevel:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->traceLevel:I

    .line 7
    .line 8
    return-void
.end method

.method private logMessage(Ljava/lang/String;)V
    .locals 1

    .line 100
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ServerLog;->checkLogFile()V

    .line 101
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->printWriter:Ljava/io/PrintWriter;

    if-eqz v0, :cond_0

    .line 102
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 103
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private logMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 13

    .line 98
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logRecordFactory:Landroid/gov/nist/javax/sip/LogRecordFactory;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p4

    move-object/from16 v10, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p8

    move-wide/from16 v5, p9

    move-wide/from16 v11, p11

    invoke-interface/range {v1 .. v12}, Landroid/gov/nist/javax/sip/LogRecordFactory;->createLogRecord(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Landroid/gov/nist/javax/sip/LogRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 99
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/LogRecord;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/ServerLog;->logMessage(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private setProperties(Ljava/util/Properties;)V
    .locals 3

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 2
    .line 3
    const-string v0, "android.javax.sip.STACK_NAME"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->description:Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "android.javax.sip.IP_ADDRESS"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackIpAddress:Ljava/lang/String;

    .line 18
    .line 19
    const-string v0, "android.gov.nist.javax.sip.SERVER_LOG"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logFileName:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "android.gov.nist.javax.sip.TRACE_LEVEL"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "android.gov.nist.javax.sip.LOG_MESSAGE_CONTENT"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v1, 0x0

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    const-string v2, "true"

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move p1, v1

    .line 53
    :goto_0
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logContent:Z

    .line 54
    .line 55
    if-eqz v0, :cond_7

    .line 56
    .line 57
    const-string p1, "LOG4J"

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    sput-boolean v1, Landroid/gov/nist/core/CommonLogger;->useLegacyLogger:Z

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_1
    :try_start_0
    const-string p1, "DEBUG"

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    const/16 p1, 0x20

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const-string p1, "INFO"

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    const/16 p1, 0x10

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    const-string p1, "ERROR"

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    const/4 p1, 0x4

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const-string p1, "NONE"

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_6

    .line 107
    .line 108
    const-string p1, "OFF"

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    goto :goto_2

    .line 122
    :cond_6
    :goto_1
    move p1, v1

    .line 123
    :goto_2
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/ServerLog;->setTraceLevel(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :catch_0
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 128
    .line 129
    const-string v2, "ServerLog: WARNING Bad integer "

    .line 130
    .line 131
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 139
    .line 140
    const-string v0, "logging dislabled "

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/ServerLog;->setTraceLevel(I)V

    .line 146
    .line 147
    .line 148
    :cond_7
    :goto_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ServerLog;->checkLogFile()V

    .line 149
    .line 150
    .line 151
    return-void
.end method


# virtual methods
.method public checkLogFile()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "\"/>\n "

    .line 4
    .line 5
    const-string v2, "\"\n auxInfo=\""

    .line 6
    .line 7
    const-string v3, "android.javax.sip.OUTBOUND_PROXY"

    .line 8
    .line 9
    const-string v4, "android.javax.sip.ROUTER_PATH"

    .line 10
    .line 11
    const-string v5, "android.javax.sip.STACK_NAME"

    .line 12
    .line 13
    const-string v6, "android.javax.sip.IP_ADDRESS"

    .line 14
    .line 15
    const-string v7, "\"\n name=\""

    .line 16
    .line 17
    const-string v8, "<description\n logDescription=\""

    .line 18
    .line 19
    const-string v9, "Here are the stack configuration properties \n"

    .line 20
    .line 21
    const-string v10, "\nandroid.gov.nist.javax.sip.REENTRANT_LISTENER= "

    .line 22
    .line 23
    const-string v11, "\nandroid.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS= "

    .line 24
    .line 25
    const-string v12, "\nandroid.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS= "

    .line 26
    .line 27
    const-string v13, "\nandroid.javax.sip.OUTBOUND_PROXY= "

    .line 28
    .line 29
    const-string v14, "\nandroid.javax.sip.ROUTER_PATH= "

    .line 30
    .line 31
    const-string v15, "Here are the stack configuration properties \nandroid.javax.sip.IP_ADDRESS= "

    .line 32
    .line 33
    move-object/from16 v16, v9

    .line 34
    .line 35
    const-string v9, "\n-->"

    .line 36
    .line 37
    move-object/from16 v17, v10

    .line 38
    .line 39
    const-string v10, "\nandroid.javax.sip.STACK_NAME= "

    .line 40
    .line 41
    move-object/from16 v18, v11

    .line 42
    .line 43
    const-string v11, "<!-- Use the  Trace Viewer in src/tools/tracesviewer to view this  trace  \nHere are the stack configuration properties \nandroid.javax.sip.IP_ADDRESS= "

    .line 44
    .line 45
    move-object/from16 v19, v12

    .line 46
    .line 47
    iget-object v12, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logFileName:Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v12, :cond_3

    .line 50
    .line 51
    iget v12, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->traceLevel:I

    .line 52
    .line 53
    move-object/from16 v20, v15

    .line 54
    .line 55
    const/16 v15, 0x10

    .line 56
    .line 57
    if-ge v12, v15, :cond_0

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_0
    :try_start_0
    new-instance v12, Ljava/io/File;

    .line 62
    .line 63
    iget-object v15, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logFileName:Ljava/lang/String;

    .line 64
    .line 65
    invoke-direct {v12, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 69
    .line 70
    .line 71
    move-result v15

    .line 72
    if-nez v15, :cond_1

    .line 73
    .line 74
    invoke-virtual {v12}, Ljava/io/File;->createNewFile()Z

    .line 75
    .line 76
    .line 77
    const/4 v12, 0x0

    .line 78
    iput-object v12, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->printWriter:Ljava/io/PrintWriter;

    .line 79
    .line 80
    :cond_1
    iget-object v12, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->printWriter:Ljava/io/PrintWriter;

    .line 81
    .line 82
    if-nez v12, :cond_3

    .line 83
    .line 84
    iget-object v12, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 85
    .line 86
    const-string v15, "android.gov.nist.javax.sip.SERVER_LOG_OVERWRITE"

    .line 87
    .line 88
    invoke-virtual {v12, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    new-instance v15, Ljava/io/FileWriter;

    .line 101
    .line 102
    move/from16 v21, v12

    .line 103
    .line 104
    iget-object v12, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logFileName:Ljava/lang/String;

    .line 105
    .line 106
    move-object/from16 v22, v1

    .line 107
    .line 108
    const/16 v23, 0x1

    .line 109
    .line 110
    xor-int/lit8 v1, v21, 0x1

    .line 111
    .line 112
    invoke-direct {v15, v12, v1}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    new-instance v1, Ljava/io/PrintWriter;

    .line 116
    .line 117
    move/from16 v12, v23

    .line 118
    .line 119
    invoke-direct {v1, v15, v12}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    .line 120
    .line 121
    .line 122
    iput-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->printWriter:Ljava/io/PrintWriter;

    .line 123
    .line 124
    new-instance v12, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v11, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 130
    .line 131
    invoke-virtual {v11, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget-object v10, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 142
    .line 143
    invoke-virtual {v10, v5}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    iget-object v10, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 154
    .line 155
    invoke-virtual {v10, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    iget-object v10, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 166
    .line 167
    invoke-virtual {v10, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-virtual {v1, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->printWriter:Ljava/io/PrintWriter;

    .line 185
    .line 186
    new-instance v9, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    iget-object v10, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->description:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object v10, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 200
    .line 201
    invoke-virtual {v10, v5}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    iget-object v5, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->auxInfo:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    move-object/from16 v5, v22

    .line 217
    .line 218
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    invoke-virtual {v1, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->auxInfo:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    .line 230
    iget-object v9, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 231
    .line 232
    const-string v10, "<![CDATA[ "

    .line 233
    .line 234
    const-string v11, "<debug>"

    .line 235
    .line 236
    const-string v12, "</debug>"

    .line 237
    .line 238
    const-string v15, "\n"

    .line 239
    .line 240
    move-object/from16 v21, v1

    .line 241
    .line 242
    const/16 v1, 0x20

    .line 243
    .line 244
    if-eqz v21, :cond_2

    .line 245
    .line 246
    :try_start_1
    invoke-virtual {v9, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isLoggingEnabled(I)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_3

    .line 251
    .line 252
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 253
    .line 254
    new-instance v9, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    move-object/from16 v21, v10

    .line 257
    .line 258
    move-object/from16 v10, v20

    .line 259
    .line 260
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    iget-object v10, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 264
    .line 265
    invoke-virtual {v10, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 276
    .line 277
    invoke-virtual {v6, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 288
    .line 289
    invoke-virtual {v4, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    move-object/from16 v3, v19

    .line 297
    .line 298
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    iget-object v3, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 302
    .line 303
    const-string v4, "android.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS"

    .line 304
    .line 305
    invoke-virtual {v3, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    move-object/from16 v3, v18

    .line 313
    .line 314
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    iget-object v3, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 318
    .line 319
    const-string v4, "android.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS"

    .line 320
    .line 321
    invoke-virtual {v3, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    move-object/from16 v3, v17

    .line 329
    .line 330
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    iget-object v3, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 334
    .line 335
    const-string v4, "android.gov.nist.javax.sip.REENTRANT_LISTENER"

    .line 336
    .line 337
    invoke-virtual {v3, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    const-string v3, "android.gov.nist.javax.sip.THREAD_POOL_SIZE= "

    .line 345
    .line 346
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    iget-object v3, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 350
    .line 351
    const-string v4, "android.gov.nist.javax.sip.THREAD_POOL_SIZE"

    .line 352
    .line 353
    invoke-virtual {v3, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 371
    .line 372
    const-string v3, " ]]> "

    .line 373
    .line 374
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 378
    .line 379
    invoke-interface {v1, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 383
    .line 384
    new-instance v3, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->description:Ljava/lang/String;

    .line 390
    .line 391
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackIpAddress:Ljava/lang/String;

    .line 398
    .line 399
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->auxInfo:Ljava/lang/String;

    .line 406
    .line 407
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 421
    .line 422
    invoke-interface {v1, v11}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 426
    .line 427
    move-object/from16 v2, v21

    .line 428
    .line 429
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    return-void

    .line 433
    :cond_2
    move-object v2, v10

    .line 434
    invoke-virtual {v9, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isLoggingEnabled(I)Z

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    if-eqz v1, :cond_3

    .line 439
    .line 440
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 441
    .line 442
    new-instance v3, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    move-object/from16 v4, v16

    .line 445
    .line 446
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->configurationProperties:Ljava/util/Properties;

    .line 450
    .line 451
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 465
    .line 466
    const-string v3, " ]]>"

    .line 467
    .line 468
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 472
    .line 473
    invoke-interface {v1, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 477
    .line 478
    new-instance v3, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->description:Ljava/lang/String;

    .line 484
    .line 485
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    iget-object v4, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackIpAddress:Ljava/lang/String;

    .line 492
    .line 493
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    const-string v4, "\" />\n"

    .line 497
    .line 498
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 509
    .line 510
    invoke-interface {v1, v11}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 514
    .line 515
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 516
    .line 517
    .line 518
    :catch_0
    :cond_3
    :goto_0
    return-void
.end method

.method public declared-synchronized closeLogFile()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->printWriter:Ljava/io/PrintWriter;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/PrintWriter;->close()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->printWriter:Ljava/io/PrintWriter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public getLogFileName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logFileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTraceLevel()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->traceLevel:I

    .line 2
    .line 3
    return p0
.end method

.method public logException(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->traceLevel:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-lt v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ServerLog;->checkLogFile()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->printWriter:Ljava/io/PrintWriter;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public logMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Landroid/gov/nist/javax/sip/stack/ServerLog;->logMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V

    return-void
.end method

.method public logMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V
    .locals 15

    move-object/from16 v0, p1

    .line 105
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ServerLog;->checkLogFile()V

    .line 106
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    move-result-object v1

    check-cast v1, Landroid/gov/nist/javax/sip/header/CallID;

    if-eqz v1, :cond_0

    .line 107
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/CallID;->getCallId()Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 108
    :goto_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFirstLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 109
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logContent:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encode()Ljava/lang/String;

    move-result-object v1

    :goto_2
    move-object v3, v1

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeMessage(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 110
    :goto_3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    move-result-object v10

    .line 111
    const-string v1, "Timestamp"

    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    move-result-object v0

    check-cast v0, Landroid/javax/sip/header/TimeStampHeader;

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    :goto_4
    move-object v2, p0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v9, p4

    move/from16 v6, p5

    move-wide/from16 v11, p6

    move-wide v13, v0

    goto :goto_5

    .line 112
    :cond_2
    invoke-interface {v0}, Landroid/javax/sip/header/TimeStampHeader;->getTime()J

    move-result-wide v0

    goto :goto_4

    .line 113
    :goto_5
    invoke-direct/range {v2 .. v14}, Landroid/gov/nist/javax/sip/stack/ServerLog;->logMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    return-void
.end method

.method public logMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/String;Ljava/lang/String;ZJ)V
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ServerLog;->checkLogFile()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFirstLine()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/gov/nist/javax/sip/header/CallID;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/CallID;->getCallId()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    move-object v7, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFirstLine()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logContent:Z

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encode()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_2
    move-object v3, v1

    .line 46
    goto :goto_3

    .line 47
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeMessage(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_2

    .line 61
    :goto_3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTransactionId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    const-string v1, "Timestamp"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroid/javax/sip/header/TimeStampHeader;

    .line 72
    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    const-wide/16 v0, 0x0

    .line 76
    .line 77
    :goto_4
    move-wide v13, v0

    .line 78
    goto :goto_5

    .line 79
    :cond_3
    invoke-interface {v0}, Landroid/javax/sip/header/TimeStampHeader;->getTime()J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    goto :goto_4

    .line 84
    :goto_5
    const/4 v9, 0x0

    .line 85
    move-object v2, p0

    .line 86
    move-object/from16 v4, p2

    .line 87
    .line 88
    move-object/from16 v5, p3

    .line 89
    .line 90
    move/from16 v6, p4

    .line 91
    .line 92
    move-wide/from16 v11, p5

    .line 93
    .line 94
    invoke-direct/range {v2 .. v14}, Landroid/gov/nist/javax/sip/stack/ServerLog;->logMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public needsLogging()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logFileName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public setAuxInfo(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->auxInfo:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setLevel(I)V
    .locals 0

    return-void
.end method

.method public setLogFileName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->logFileName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSipStack(Landroid/javax/sip/SipStack;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 6
    .line 7
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getStackLogger()Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "sipStack must be a SIPTransactionStack"

    .line 17
    .line 18
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setStackIpAddress(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->stackIpAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setStackProperties(Ljava/util/Properties;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/ServerLog;->setProperties(Ljava/util/Properties;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setTraceLevel(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/ServerLog;->traceLevel:I

    .line 2
    .line 3
    return-void
.end method

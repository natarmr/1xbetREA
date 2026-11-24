.class Landroid/gov/nist/javax/sip/stack/MessageLog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/LogRecord;


# instance fields
.field private callId:Ljava/lang/String;

.field private destination:Ljava/lang/String;

.field private firstLine:Ljava/lang/String;

.field private isSender:Z

.field private message:Ljava/lang/String;

.field private source:Ljava/lang/String;

.field private tid:Ljava/lang/String;

.field private timeStamp:J

.field private timeStampHeaderValue:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 69
    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 70
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->message:Ljava/lang/String;

    .line 71
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->source:Ljava/lang/String;

    .line 72
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->destination:Ljava/lang/String;

    const-wide/16 p1, 0x0

    cmp-long p1, p4, p1

    if-ltz p1, :cond_0

    .line 73
    iput-wide p4, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStamp:J

    .line 74
    iput-boolean p6, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->isSender:Z

    .line 75
    iput-object p7, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->firstLine:Ljava/lang/String;

    .line 76
    iput-object p8, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->tid:Ljava/lang/String;

    .line 77
    iput-object p9, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->callId:Ljava/lang/String;

    .line 78
    iput-wide p10, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStampHeaderValue:J

    return-void

    .line 79
    :cond_0
    const-string p0, "negative ts"

    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_1
    const-string p0, "null msg"

    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->message:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->source:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->destination:Ljava/lang/String;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    const-wide/16 v1, 0x0

    .line 26
    .line 27
    cmp-long p3, p1, v1

    .line 28
    .line 29
    if-ltz p3, :cond_0

    .line 30
    .line 31
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStamp:J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    iput-boolean p5, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->isSender:Z

    .line 34
    .line 35
    iput-object p6, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->firstLine:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p7, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->tid:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p8, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->callId:Ljava/lang/String;

    .line 40
    .line 41
    iput-wide p9, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStampHeaderValue:J

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    const-string p1, "Bad time stamp "

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 52
    :catch_0
    const-string p0, "Bad number format "

    .line 53
    .line 54
    invoke-static {p0, p4}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_1
    const-string p0, "null msg"

    .line 63
    .line 64
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/gov/nist/javax/sip/stack/MessageLog;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Landroid/gov/nist/javax/sip/stack/MessageLog;

    .line 8
    .line 9
    iget-object v0, p1, Landroid/gov/nist/javax/sip/stack/MessageLog;->message:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->message:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-wide v2, p1, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStamp:J

    .line 20
    .line 21
    iget-wide p0, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStamp:J

    .line 22
    .line 23
    cmp-long p0, v2, p0

    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_1
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "<message\nfrom=\""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->source:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\" \nto=\""

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->destination:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "\" \ntime=\""

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStamp:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "\""

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v2, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStampHeaderValue:J

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    cmp-long v2, v2, v4

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v3, "\ntimeStamp = \""

    .line 49
    .line 50
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-wide v3, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->timeStampHeaderValue:J

    .line 54
    .line 55
    invoke-static {v3, v4, v1, v2}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-string v1, ""

    .line 61
    .line 62
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, "\nisSender=\""

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->isSender:Z

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, "\" \ntransactionId=\""

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->tid:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, "\" \ncallId=\""

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->callId:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, "\" \nfirstLine=\""

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->firstLine:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v1, "\" \n>\n"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-string v1, "<![CDATA["

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageLog;->message:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    const-string v0, "]]>\n"

    .line 139
    .line 140
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    const-string v0, "</message>\n"

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0
.end method

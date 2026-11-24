.class public Landroid/gov/nist/javax/sdp/parser/SDPAnnounceParser;
.super Landroid/gov/nist/core/ParserCore;
.source "SourceFile"


# instance fields
.field protected lexer:Landroid/gov/nist/javax/sdp/parser/Lexer;

.field protected sdpMessage:Ljava/util/Vector;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/ParserCore;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    new-instance v0, Ljava/util/Vector;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/parser/SDPAnnounceParser;->sdpMessage:Ljava/util/Vector;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, "\r\n"

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x0

    .line 37
    const/4 v1, 0x0

    .line 38
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-ge v0, v2, :cond_8

    .line 43
    .line 44
    const-string v2, "\n"

    .line 45
    .line 46
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const-string v3, "\r"

    .line 51
    .line 52
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ltz v2, :cond_2

    .line 57
    .line 58
    if-gez v3, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    :cond_1
    move-object v1, v0

    .line 67
    move v0, v2

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    if-gez v2, :cond_4

    .line 70
    .line 71
    if-ltz v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    :cond_3
    move-object v1, v0

    .line 80
    move v0, v3

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    if-ltz v2, :cond_6

    .line 83
    .line 84
    if-ltz v3, :cond_6

    .line 85
    .line 86
    if-le v2, v3, :cond_5

    .line 87
    .line 88
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    if-ne v2, v3, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    if-ne v3, v2, :cond_1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    if-gez v2, :cond_7

    .line 107
    .line 108
    if-gez v3, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    :goto_3
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/parser/SDPAnnounceParser;->sdpMessage:Ljava/util/Vector;

    .line 112
    .line 113
    invoke-virtual {v2, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_8
    :goto_4
    return-void
.end method

.method public constructor <init>(Ljava/util/Vector;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Landroid/gov/nist/core/ParserCore;-><init>()V

    .line 119
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/parser/SDPAnnounceParser;->sdpMessage:Ljava/util/Vector;

    return-void
.end method


# virtual methods
.method public parse()Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;
    .locals 3

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/parser/SDPAnnounceParser;->sdpMessage:Ljava/util/Vector;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/parser/SDPAnnounceParser;->sdpMessage:Ljava/util/Vector;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v2}, Landroid/gov/nist/javax/sdp/parser/ParserFactory;->createParser(Ljava/lang/String;)Landroid/gov/nist/javax/sdp/parser/SDPParser;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/parser/SDPParser;->parse()Landroid/gov/nist/javax/sdp/fields/SDPField;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 v2, 0x0

    .line 35
    :goto_1
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sdp/SessionDescriptionImpl;->addField(Landroid/gov/nist/javax/sdp/fields/SDPField;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0
.end method

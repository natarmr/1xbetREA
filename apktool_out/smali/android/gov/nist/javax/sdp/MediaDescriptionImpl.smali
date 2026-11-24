.class public Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# instance fields
.field protected attributeFields:Ljava/util/Vector;

.field protected bandwidthFields:Ljava/util/Vector;

.field protected connectionField:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

.field protected informationField:Landroid/gov/nist/javax/sdp/fields/InformationField;

.field protected keyField:Landroid/gov/nist/javax/sdp/fields/KeyField;

.field protected mediaField:Landroid/gov/nist/javax/sdp/fields/MediaField;

.field protected preconditionFields:Landroid/gov/nist/javax/sdp/fields/PreconditionFields;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/Vector;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 10
    .line 11
    new-instance v0, Ljava/util/Vector;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 17
    .line 18
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->preconditionFields:Landroid/gov/nist/javax/sdp/fields/PreconditionFields;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public addAttribute(Landroid/gov/nist/javax/sdp/fields/AttributeField;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addBandwidthField(Landroid/gov/nist/javax/sdp/fields/BandwidthField;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addDynamicPayloads(Ljava/util/Vector;Ljava/util/Vector;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/Vector;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/Vector;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p2}, Ljava/util/Vector;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ge v0, v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p2, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0, v1, v2}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void

    .line 53
    :cond_1
    const-string p0, " The vector sizes are unequal"

    .line 54
    .line 55
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string p0, " The vectors are empty"

    .line 60
    .line 61
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    const-string p0, " The vectors are null"

    .line 66
    .line 67
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public encode()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->mediaField:Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/MediaField;->encode()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->informationField:Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/InformationField;->encode()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->connectionField:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->encode()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    move v1, v2

    .line 45
    :goto_0
    iget-object v3, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-ge v1, v3, :cond_3

    .line 52
    .line 53
    iget-object v3, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Landroid/gov/nist/javax/sdp/fields/SDPField;

    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/gov/nist/javax/sdp/fields/SDPField;->encode()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->preconditionFields:Landroid/gov/nist/javax/sdp/fields/PreconditionFields;

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->getPreconditionSize()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    move v3, v2

    .line 80
    :goto_1
    if-ge v3, v1, :cond_4

    .line 81
    .line 82
    iget-object v4, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->preconditionFields:Landroid/gov/nist/javax/sdp/fields/PreconditionFields;

    .line 83
    .line 84
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->getPreconditions()Ljava/util/Vector;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v4, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Landroid/gov/nist/javax/sdp/fields/SDPField;

    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/gov/nist/javax/sdp/fields/SDPField;->encode()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->keyField:Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 105
    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/KeyField;->encode()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    :cond_5
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 116
    .line 117
    if-eqz v1, :cond_6

    .line 118
    .line 119
    :goto_2
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-ge v2, v1, :cond_6

    .line 126
    .line 127
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/SDPField;

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/SDPField;->encode()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0
.end method

.method public getAttribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValue;->getValueAsObject()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/lang/String;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    const-string p0, "null arg!"

    .line 51
    .line 52
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public getAttributeFields()Ljava/util/Vector;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAttributes(Z)Ljava/util/Vector;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBandwidth(Ljava/lang/String;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->getBwtype()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->getBandwidth()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return v2

    .line 47
    :cond_3
    const-string p0, "null parameter"

    .line 48
    .line 49
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return v0
.end method

.method public getBandwidths(Z)Ljava/util/Vector;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 2
    .line 3
    return-object p0
.end method

.method public getConnection()La/j1e;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->connectionField:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getConnectionField()Landroid/gov/nist/javax/sdp/fields/ConnectionField;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->connectionField:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDuplexity()Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "sendrecv"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "recvonly"

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const-string v3, "sendonly"

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v3, "inactive"

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    :goto_1
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_2
    const/4 p0, 0x0

    .line 96
    return-object p0
.end method

.method public getInfo()La/f8x;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getInformationField()Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    :cond_0
    return-object p0
.end method

.method public getInformationField()Landroid/gov/nist/javax/sdp/fields/InformationField;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->informationField:Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getKey()La/sjy;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->keyField:Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    return-object p0
.end method

.method public getKeyField()Landroid/gov/nist/javax/sdp/fields/KeyField;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->keyField:Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMedia()La/zl30;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->mediaField:Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMediaField()Landroid/gov/nist/javax/sdp/fields/MediaField;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->mediaField:Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMimeParameters()Ljava/util/Vector;
    .locals 4

    .line 1
    const-string v0, "rate"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "ptime"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "maxptime"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "ftmp"

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v3, Ljava/util/Vector;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, p0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v3
.end method

.method public getMimeTypes()Ljava/util/Vector;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getMedia()La/zl30;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sdp/fields/MediaField;->getMediaType()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sdp/fields/MediaField;->getProtocol()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v0, v3}, Landroid/gov/nist/javax/sdp/fields/MediaField;->getMediaFormats(Z)Ljava/util/Vector;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v4, Ljava/util/Vector;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/util/Vector;-><init>()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-ge v3, v5, :cond_2

    .line 30
    .line 31
    const-string v5, "RTP/AVP"

    .line 32
    .line 33
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const-string v6, "/"

    .line 38
    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    const-string v5, "rtpmap"

    .line 42
    .line 43
    invoke-virtual {p0, v5}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    invoke-static {v1, v6, v2}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    const/4 v5, 0x0

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {v1, v6, v2}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    :goto_1
    invoke-virtual {v4, v5}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object v4
.end method

.method public getPreconditionFields()Ljava/util/Vector;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->preconditionFields:Landroid/gov/nist/javax/sdp/fields/PreconditionFields;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->getPreconditions()Ljava/util/Vector;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public hasAttribute(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v0
.end method

.method public removeAttribute(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-ge v0, p1, :cond_2

    .line 45
    .line 46
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/util/Vector;->removeElementAt(I)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void

    .line 52
    :cond_3
    const-string p0, "null arg!"

    .line 53
    .line 54
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public removeBandwidth(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->getBwtype()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-ge v0, p1, :cond_2

    .line 43
    .line 44
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/util/Vector;->removeElementAt(I)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :cond_3
    const-string p0, "null bandwidth type"

    .line 51
    .line 52
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, p2}, Landroid/gov/nist/core/NameValue;->setValueAsObject(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    :goto_1
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ne v0, v1, :cond_2

    .line 52
    .line 53
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 54
    .line 55
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/AttributeField;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v1, Landroid/gov/nist/core/NameValue;

    .line 59
    .line 60
    invoke-direct {v1, p1, p2}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setAttribute(Landroid/gov/nist/core/NameValue;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void

    .line 72
    :cond_3
    const-string p0, "The parameters are null"

    .line 73
    .line 74
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public setAttributeFields(Ljava/util/Vector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 2
    .line 3
    return-void
.end method

.method public setAttributes(Ljava/util/Vector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 2
    .line 3
    return-void
.end method

.method public setBandwidth(Ljava/lang/String;I)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->getBwtype()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1, p2}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->setBandwidth(I)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :goto_1
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/BandwidthField;

    .line 48
    .line 49
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->setType(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p2}, Landroid/gov/nist/javax/sdp/fields/BandwidthField;->setValue(I)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void

    .line 64
    :cond_3
    const-string p0, "The name is null"

    .line 65
    .line 66
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public setBandwidths(Ljava/util/Vector;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->bandwidthFields:Ljava/util/Vector;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "The vector bandwidths is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setConnection(La/j1e;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->connectionField:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "bad implementation"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The conn is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setConnectionField(Landroid/gov/nist/javax/sdp/fields/ConnectionField;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->connectionField:Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 2
    .line 3
    return-void
.end method

.method public setDuplexity(Ljava/lang/String;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ge v0, v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v4, "sendrecv"

    .line 30
    .line 31
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v4, "recvonly"

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v4, "sendonly"

    .line 62
    .line 63
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_1

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->getAttribute()Landroid/gov/nist/core/NameValue;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const-string v4, "inactive"

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    :goto_1
    new-instance p0, Landroid/gov/nist/core/NameValue;

    .line 90
    .line 91
    invoke-direct {p0, p1, v3}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setAttribute(Landroid/gov/nist/core/NameValue;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-ne v0, v1, :cond_3

    .line 103
    .line 104
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/AttributeField;

    .line 105
    .line 106
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/AttributeField;-><init>()V

    .line 107
    .line 108
    .line 109
    new-instance v1, Landroid/gov/nist/core/NameValue;

    .line 110
    .line 111
    invoke-direct {v1, p1, v3}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sdp/fields/AttributeField;->setAttribute(Landroid/gov/nist/core/NameValue;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->attributeFields:Ljava/util/Vector;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_3
    return-void

    .line 123
    :cond_4
    const-string p0, "Null arg"

    .line 124
    .line 125
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public setInfo(La/f8x;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->informationField:Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "A informationField parameter is required"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The info is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setInformationField(Landroid/gov/nist/javax/sdp/fields/InformationField;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->informationField:Landroid/gov/nist/javax/sdp/fields/InformationField;

    .line 2
    .line 3
    return-void
.end method

.method public setKey(La/sjy;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->setKeyField(Landroid/gov/nist/javax/sdp/fields/KeyField;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "A keyField parameter is required"

    .line 14
    .line 15
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    const-string p0, "The key is null"

    .line 20
    .line 21
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setKeyField(Landroid/gov/nist/javax/sdp/fields/KeyField;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->keyField:Landroid/gov/nist/javax/sdp/fields/KeyField;

    .line 2
    .line 3
    return-void
.end method

.method public setMedia(La/zl30;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->mediaField:Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "A mediaField parameter is required"

    .line 13
    .line 14
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "The media is null"

    .line 19
    .line 20
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setMediaField(Landroid/gov/nist/javax/sdp/fields/MediaField;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->mediaField:Landroid/gov/nist/javax/sdp/fields/MediaField;

    .line 2
    .line 3
    return-void
.end method

.method public setPreconditionFields(Ljava/util/Vector;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->preconditionFields:Landroid/gov/nist/javax/sdp/fields/PreconditionFields;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/PreconditionFields;->setPreconditions(Ljava/util/Vector;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setPreconditions(Landroid/gov/nist/javax/sdp/fields/PreconditionFields;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->preconditionFields:Landroid/gov/nist/javax/sdp/fields/PreconditionFields;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/MediaDescriptionImpl;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

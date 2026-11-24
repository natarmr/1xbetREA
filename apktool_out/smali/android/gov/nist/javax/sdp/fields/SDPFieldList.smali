.class public abstract Landroid/gov/nist/javax/sdp/fields/SDPFieldList;
.super Landroid/gov/nist/javax/sdp/fields/SDPField;
.source "SourceFile"


# instance fields
.field protected sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>(Ljava/lang/String;)V

    .line 14
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    invoke-direct {v0, p1, p2}, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    return-void
.end method


# virtual methods
.method public add(Landroid/gov/nist/javax/sdp/fields/SDPField;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;->add(Landroid/gov/nist/javax/sdp/fields/SDPObject;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObjectList;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public debugDump()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 107
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->debugDump(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public debugDump(I)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iput-object v0, p0, Landroid/gov/nist/core/GenericObject;->stringRepresentation:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/Indentation;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Landroid/gov/nist/javax/sdp/fields/Indentation;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/gov/nist/javax/sdp/fields/Indentation;->getIndentation()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/fields/SDPObject;->sprint(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, "{"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sdp/fields/SDPObject;->sprint(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Landroid/gov/nist/core/GenericObjectList;->debugDump(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/SDPObject;->sprint(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, "}"

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/SDPObject;->sprint(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, Landroid/gov/nist/core/GenericObject;->stringRepresentation:Ljava/lang/String;

    .line 105
    .line 106
    return-object p0
.end method

.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/gov/nist/javax/sdp/fields/SDPField;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/gov/nist/javax/sdp/fields/SDPField;->encode()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;

    .line 21
    .line 22
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 23
    .line 24
    iget-object p1, p1, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 25
    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_2
    return v0

    .line 33
    :cond_3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/GenericObjectList;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public first()Landroid/gov/nist/javax/sdp/fields/SDPObject;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;->first()Landroid/gov/nist/core/GenericObject;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/SDPObject;

    .line 8
    .line 9
    return-object p0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public match(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    check-cast p1, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;

    .line 22
    .line 23
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 24
    .line 25
    iget-object p1, p1, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 26
    .line 27
    if-ne p0, p1, :cond_2

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/GenericObjectList;->match(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0
.end method

.method public next()Landroid/gov/nist/javax/sdp/fields/SDPObject;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->sdpFields:Landroid/gov/nist/javax/sdp/fields/SDPObjectList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/SDPObjectList;->next()Landroid/gov/nist/core/GenericObject;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/SDPObject;

    .line 8
    .line 9
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/SDPFieldList;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

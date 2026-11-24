.class public Landroid/gov/nist/javax/sip/header/SIPObjectList;
.super Landroid/gov/nist/core/GenericObjectList;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x29d7fb4297970e29L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Landroid/gov/nist/core/GenericObjectList;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/core/GenericObjectList;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public concatenate(Landroid/gov/nist/javax/sip/header/SIPObjectList;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/gov/nist/core/GenericObjectList;->concatenate(Landroid/gov/nist/core/GenericObjectList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public concatenate(Landroid/gov/nist/javax/sip/header/SIPObjectList;Z)V
    .locals 0

    .line 5
    invoke-super {p0, p1, p2}, Landroid/gov/nist/core/GenericObjectList;->concatenate(Landroid/gov/nist/core/GenericObjectList;Z)V

    return-void
.end method

.method public debugDump(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/gov/nist/core/GenericObjectList;->debugDump(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public first()Landroid/gov/nist/core/GenericObject;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObjectList;->first()Landroid/gov/nist/core/GenericObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPObject;

    .line 6
    .line 7
    return-object p0
.end method

.method public mergeObjects(Landroid/gov/nist/core/GenericObjectList;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/gov/nist/core/GenericObject;

    .line 20
    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/GenericObject;->merge(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public next()Landroid/gov/nist/core/GenericObject;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObjectList;->next()Landroid/gov/nist/core/GenericObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/gov/nist/javax/sip/header/SIPObject;

    .line 6
    .line 7
    return-object p0
.end method

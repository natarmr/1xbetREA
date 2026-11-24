.class public Landroid/gov/nist/core/DuplicateNameValueList;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = -0x4ddf7598584c3ad8L


# instance fields
.field private nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/gov/nist/core/MultiValueMapImpl<",
            "Landroid/gov/nist/core/NameValue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/core/MultiValueMapImpl;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/gov/nist/core/MultiValueMapImpl;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Landroid/gov/nist/core/DuplicateNameValueList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/core/DuplicateNameValueList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroid/gov/nist/core/NameValue;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/gov/nist/core/NameValue;->clone()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/gov/nist/core/NameValue;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/DuplicateNameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
.end method

.method public delete(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/MultiValueMapImpl;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/MultiValueMapImpl;->remove(Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/core/DuplicateNameValueList;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/core/MultiValueMapImpl;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v1, v0, Landroid/gov/nist/core/GenericObject;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    check-cast v0, Landroid/gov/nist/core/GenericObject;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/GenericObject;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    const-string v0, ";"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

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
    if-nez v1, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    check-cast p1, Landroid/gov/nist/core/DuplicateNameValueList;

    .line 21
    .line 22
    iget-object v1, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/gov/nist/core/MultiValueMapImpl;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v2, p1, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/gov/nist/core/MultiValueMapImpl;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    iget-object v1, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/gov/nist/core/MultiValueMapImpl;->keySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_5

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0, v2}, Landroid/gov/nist/core/DuplicateNameValueList;->getNameValue(Ljava/lang/String;)Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v4, p1, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 64
    .line 65
    invoke-virtual {v4, v2}, Landroid/gov/nist/core/MultiValueMapImpl;->get(Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    return v0

    .line 72
    :cond_4
    invoke-interface {v2, v3}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    return v0

    .line 79
    :cond_5
    const/4 p0, 0x1

    .line 80
    return p0
.end method

.method public getNameValue(Ljava/lang/String;)Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/MultiValueMapImpl;->get(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getNames()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/DuplicateNameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

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
    return-object p0

    .line 9
    :cond_0
    instance-of p1, p0, Landroid/gov/nist/core/GenericObject;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    check-cast p0, Landroid/gov/nist/core/GenericObject;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObject;->encode()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public getValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/DuplicateNameValueList;->getNameValue(Ljava/lang/String;)Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public hasNameValue(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/MultiValueMapImpl;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Set;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroid/gov/nist/core/NameValue;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public put(Ljava/lang/String;Landroid/gov/nist/core/NameValue;)Landroid/gov/nist/core/NameValue;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/core/MultiValueMapImpl;->put(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/core/NameValue;

    .line 8
    .line 9
    return-object p0
.end method

.method public remove(Ljava/lang/Object;)Landroid/gov/nist/core/NameValue;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/MultiValueMapImpl;->remove(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/core/NameValue;

    .line 8
    .line 9
    return-object p0
.end method

.method public set(Landroid/gov/nist/core/NameValue;)V
    .locals 1

    .line 16
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    invoke-virtual {p1}, Landroid/gov/nist/core/NameValue;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/core/MultiValueMapImpl;->put(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    return-void
.end method

.method public set(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1, v0}, Landroid/gov/nist/core/MultiValueMapImpl;->put(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/DuplicateNameValueList;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public values()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Landroid/gov/nist/core/NameValue;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/DuplicateNameValueList;->nameValueMap:Landroid/gov/nist/core/MultiValueMapImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/MultiValueMapImpl;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

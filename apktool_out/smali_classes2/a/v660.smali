.class public final La/v660;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sgy;
.implements La/oiy;
.implements La/jys0;


# static fields
.field public static final b:La/v660;


# instance fields
.field public final synthetic a:La/sgy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/v660;

    .line 2
    .line 3
    invoke-direct {v0}, La/v660;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/v660;->b:La/v660;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Ljava/lang/Void;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, La/v660;->a:La/sgy;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final I()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->I()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final J()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Nothing"

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->b()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final g()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->g()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/pgy;->getAnnotations()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->getTypeParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->i()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->l()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final r(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/sgy;->r(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final s()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/v660;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->s()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NothingKClass"

    .line 2
    .line 3
    return-object p0
.end method

.method public final v()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "kotlin.Nothing"

    .line 2
    .line 3
    return-object p0
.end method

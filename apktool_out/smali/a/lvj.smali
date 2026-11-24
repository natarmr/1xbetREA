.class public final La/lvj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final b:La/lvj;


# instance fields
.field public final a:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/lvj;

    .line 2
    .line 3
    invoke-direct {v0}, La/lvj;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/lvj;->b:La/lvj;

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
    const/4 v0, 0x0

    .line 5
    new-array v0, v0, [La/ugi0;

    .line 6
    .line 7
    const-string v1, "java.io.Serializable"

    .line 8
    .line 9
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/lvj;->a:La/wgi0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/rkj;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p1, La/tzg0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    check-cast p1, La/tzg0;

    .line 7
    .line 8
    iget-object p0, p1, La/tzg0;->l:Landroid/os/Bundle;

    .line 9
    .line 10
    iget-object p1, p1, La/tzg0;->n:Ljava/lang/String;

    .line 11
    .line 12
    const-class v0, Ljava/io/Serializable;

    .line 13
    .line 14
    sget-object v2, La/sre0;->a:La/tre0;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v3, 0x22

    .line 30
    .line 31
    if-lt v2, v3, :cond_0

    .line 32
    .line 33
    invoke-static {p0, p1, v0}, La/f7;->k(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object p0, v1

    .line 50
    :goto_0
    if-eqz p0, :cond_2

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p1}, La/g8x;->O(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :cond_3
    iget-object p0, p0, La/lvj;->a:La/wgi0;

    .line 58
    .line 59
    iget-object p0, p0, La/wgi0;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p0, p1}, La/h8x;->E(Ljava/lang/String;La/rkj;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v1
.end method

.method public final b(La/bwn;Ljava/io/Serializable;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/uzg0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/uzg0;

    .line 9
    .line 10
    iget-object p0, p1, La/uzg0;->u:Landroid/os/Bundle;

    .line 11
    .line 12
    iget-object p1, p1, La/uzg0;->w:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p0, p0, La/lvj;->a:La/wgi0;

    .line 22
    .line 23
    iget-object p0, p0, La/wgi0;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p0, p1}, La/h8x;->G(Ljava/lang/String;La/bwn;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final bridge synthetic deserialize(La/rkj;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/lvj;->a(La/rkj;)Ljava/io/Serializable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lvj;->a:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/io/Serializable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/lvj;->b(La/bwn;Ljava/io/Serializable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

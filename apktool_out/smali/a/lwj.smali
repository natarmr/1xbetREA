.class public final La/lwj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final b:La/lwj;


# instance fields
.field public final a:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/lwj;

    .line 2
    .line 3
    invoke-direct {v0}, La/lwj;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/lwj;->b:La/lwj;

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
    const-string v1, "android.os.Parcelable"

    .line 8
    .line 9
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/lwj;->a:La/wgi0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/rkj;)Landroid/os/Parcelable;
    .locals 3

    .line 1
    instance-of v0, p1, La/tzg0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

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
    const-class v0, Landroid/os/Parcelable;

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
    invoke-static {p0, p1, v0}, La/knx;->P(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Landroid/os/Parcelable;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-static {p1}, La/g8x;->O(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :cond_1
    iget-object p0, p0, La/lwj;->a:La/wgi0;

    .line 41
    .line 42
    iget-object p0, p0, La/wgi0;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p0, p1}, La/h8x;->E(Ljava/lang/String;La/rkj;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method

.method public final b(La/bwn;Landroid/os/Parcelable;)V
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
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p0, p0, La/lwj;->a:La/wgi0;

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
    invoke-virtual {p0, p1}, La/lwj;->a(La/rkj;)Landroid/os/Parcelable;

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
    iget-object p0, p0, La/lwj;->a:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroid/os/Parcelable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/lwj;->b(La/bwn;Landroid/os/Parcelable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

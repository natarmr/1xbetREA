.class public final La/dp80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/dp80;

.field public static final b:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/dp80;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dp80;->a:La/dp80;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [La/ugi0;

    .line 10
    .line 11
    const-string v1, "kotlin.collections.List<android.os.Parcelable>"

    .line 12
    .line 13
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/dp80;->b:La/wgi0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(La/rkj;)Ljava/util/List;
    .locals 4

    .line 1
    instance-of p0, p1, La/tzg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_2

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
    const-class v1, Landroid/os/Parcelable;

    .line 13
    .line 14
    sget-object v2, La/sre0;->a:La/tre0;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

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
    invoke-static {p0, p1, v1}, La/f7;->g(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :goto_0
    if-eqz p0, :cond_1

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    invoke-static {p1}, La/g8x;->O(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_2
    sget-object p0, La/dp80;->b:La/wgi0;

    .line 50
    .line 51
    iget-object p0, p0, La/wgi0;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {p0, p1}, La/h8x;->E(Ljava/lang/String;La/rkj;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final b(La/bwn;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p1, La/uzg0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

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
    invoke-static {p2}, La/l8x;->q0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object p0, La/dp80;->b:La/wgi0;

    .line 26
    .line 27
    iget-object p0, p0, La/wgi0;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p0, p1}, La/h8x;->G(Ljava/lang/String;La/bwn;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final bridge synthetic deserialize(La/rkj;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/dp80;->a(La/rkj;)Ljava/util/List;

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
    sget-object p0, La/dp80;->b:La/wgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/dp80;->b(La/bwn;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

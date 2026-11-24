.class public final La/hvb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/hvb;

.field public static final b:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/hvb;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/hvb;->a:La/hvb;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [La/ugi0;

    .line 10
    .line 11
    const-string v1, "kotlin.collections.List<kotlin.CharSequence>"

    .line 12
    .line 13
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/hvb;->b:La/wgi0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(La/rkj;)Ljava/util/List;
    .locals 1

    .line 1
    instance-of p0, p1, La/tzg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getCharSequenceArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {p1}, La/g8x;->O(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    sget-object p0, La/hvb;->b:La/wgi0;

    .line 27
    .line 28
    iget-object p0, p0, La/wgi0;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p0, p1}, La/h8x;->E(Ljava/lang/String;La/rkj;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
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
    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putCharSequenceArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object p0, La/hvb;->b:La/wgi0;

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
    invoke-virtual {p0, p1}, La/hvb;->a(La/rkj;)Ljava/util/List;

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
    sget-object p0, La/hvb;->b:La/wgi0;

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
    invoke-virtual {p0, p1, p2}, La/hvb;->b(La/bwn;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

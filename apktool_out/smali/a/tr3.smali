.class public final La/tr3;
.super La/oyc;
.source "SourceFile"


# instance fields
.field public final synthetic c:B

.field public final synthetic d:La/hie0;

.field public final synthetic e:La/jie0;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLa/hie0;La/jie0;Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/tr3;->c:B

    iput-object p2, p0, La/tr3;->d:La/hie0;

    iput-object p3, p0, La/tr3;->e:La/jie0;

    iput-object p4, p0, La/tr3;->f:Landroid/view/View;

    iput-object p5, p0, La/tr3;->g:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/oyc;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final f(La/div0;)V
    .locals 5

    .line 1
    iget-byte v0, p0, La/tr3;->c:B

    .line 2
    .line 3
    iget-object v1, p0, La/tr3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/tr3;->e:La/jie0;

    .line 6
    .line 7
    iget-object v3, p0, La/tr3;->f:Landroid/view/View;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object p0, p0, La/tr3;->d:La/hie0;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 16
    .line 17
    invoke-virtual {p1}, La/civ0;->d()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    and-int/lit8 p1, p1, 0x8

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iput-boolean v4, p0, La/hie0;->a:Z

    .line 26
    .line 27
    :cond_0
    check-cast v1, La/pz40;

    .line 28
    .line 29
    invoke-static {v3, v2, v1}, La/osm0;->n(Landroid/view/View;La/jie0;La/pz40;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 34
    .line 35
    invoke-virtual {p1}, La/civ0;->d()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    and-int/lit8 p1, p1, 0x8

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iput-boolean v4, p0, La/hie0;->a:Z

    .line 44
    .line 45
    :cond_1
    check-cast v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 46
    .line 47
    invoke-static {v3, v2, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->y(Landroid/view/View;La/jie0;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(La/div0;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/tr3;->c:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/tr3;->d:La/hie0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 10
    .line 11
    invoke-virtual {p1}, La/civ0;->d()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iput-boolean v1, p0, La/hie0;->a:Z

    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 23
    .line 24
    invoke-virtual {p1}, La/civ0;->d()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p1, p1, 0x8

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iput-boolean v1, p0, La/hie0;->a:Z

    .line 33
    .line 34
    :cond_1
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(La/xiv0;Ljava/util/List;)La/xiv0;
    .locals 4

    .line 1
    iget-byte v0, p0, La/tr3;->c:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    iget-object v2, p0, La/tr3;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/tr3;->e:La/jie0;

    .line 8
    .line 9
    iget-object p0, p0, La/tr3;->f:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v2, La/pz40;

    .line 21
    .line 22
    iget-object p2, p1, La/xiv0;->a:La/uiv0;

    .line 23
    .line 24
    invoke-virtual {p2, v1}, La/uiv0;->u(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p2, v1}, La/uiv0;->i(I)La/pfx;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget p2, p2, La/pfx;->d:I

    .line 33
    .line 34
    int-to-float p2, p2

    .line 35
    invoke-static {p0, v3, v2, v0, p2}, La/osm0;->m(Landroid/view/View;La/jie0;La/pz40;ZF)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_0
    check-cast v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 40
    .line 41
    iget-object p2, p1, La/xiv0;->a:La/uiv0;

    .line 42
    .line 43
    invoke-virtual {p2, v1}, La/uiv0;->u(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p2, v1}, La/uiv0;->i(I)La/pfx;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iget p2, p2, La/pfx;->d:I

    .line 52
    .line 53
    int-to-float p2, p2

    .line 54
    invoke-static {p0, v3, v2, v0, p2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->z(Landroid/view/View;La/jie0;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;ZF)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(La/div0;La/hcp0;)La/hcp0;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tr3;->c:B

    .line 2
    .line 3
    iget-object p0, p0, La/tr3;->e:La/jie0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 10
    .line 11
    invoke-virtual {p1}, La/civ0;->d()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p1, p1, 0x8

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p2, La/hcp0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, La/pfx;

    .line 22
    .line 23
    iget p1, p1, La/pfx;->d:I

    .line 24
    .line 25
    int-to-float p1, p1

    .line 26
    cmpl-float v0, p1, v1

    .line 27
    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    iput p1, p0, La/jie0;->a:F

    .line 31
    .line 32
    :cond_0
    return-object p2

    .line 33
    :pswitch_0
    iget-object p1, p1, La/div0;->a:La/civ0;

    .line 34
    .line 35
    invoke-virtual {p1}, La/civ0;->d()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    and-int/lit8 p1, p1, 0x8

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, p2, La/hcp0;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, La/pfx;

    .line 46
    .line 47
    iget p1, p1, La/pfx;->d:I

    .line 48
    .line 49
    int-to-float p1, p1

    .line 50
    cmpl-float v0, p1, v1

    .line 51
    .line 52
    if-lez v0, :cond_1

    .line 53
    .line 54
    iput p1, p0, La/jie0;->a:F

    .line 55
    .line 56
    :cond_1
    return-object p2

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

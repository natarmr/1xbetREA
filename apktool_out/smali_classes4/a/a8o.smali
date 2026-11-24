.class public final synthetic La/a8o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/wnk;


# direct methods
.method public synthetic constructor <init>(La/wnk;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/a8o;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a8o;->c:La/wnk;

    iput-object p2, p0, La/a8o;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/wnk;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/a8o;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a8o;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/a8o;->c:La/wnk;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/a8o;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/a8o;->c:La/wnk;

    .line 4
    .line 5
    iget-object p0, p0, La/a8o;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, La/bmg;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, La/bmg;->a:Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;

    .line 27
    .line 28
    new-instance v0, La/a8o;

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, La/a8o;-><init>(Lkotlin/jvm/functions/Function1;La/wnk;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v1, La/wnk;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->setTitle(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v1, La/wnk;->d:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->setSubtitle(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, v1, La/wnk;->e:La/tnk;

    .line 47
    .line 48
    iget-object v3, p0, La/tnk;->a:Ljava/lang/String;

    .line 49
    .line 50
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 51
    .line 52
    iget-object p0, p1, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->q:La/jk3;

    .line 53
    .line 54
    iget-object p0, p0, La/jk3;->c:Landroid/view/View;

    .line 55
    .line 56
    move-object v2, p0

    .line 57
    check-cast v2, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/16 v9, 0x1fc

    .line 61
    .line 62
    const v4, 0x7f080457

    .line 63
    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-static/range {v2 .. v9}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 69
    .line 70
    .line 71
    iget-object p0, v1, La/wnk;->f:La/rnk;

    .line 72
    .line 73
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->setBannerType(La/rnk;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

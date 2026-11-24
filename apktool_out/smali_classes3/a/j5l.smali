.class public final synthetic La/j5l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k4l;


# direct methods
.method public synthetic constructor <init>(La/k4l;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j5l;->a:B

    iput-object p1, p0, La/j5l;->b:La/k4l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/j5l;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/j5l;->b:La/k4l;

    .line 4
    .line 5
    check-cast p1, La/m5l;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/k4l;->c:La/xnp0;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, La/m5l;->setTeam(La/xnp0;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/k4l;->d:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, La/m5l;->setHeroes(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, La/k4l;->e:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, La/m5l;->setHeroesItems(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/k4l;->f:La/lc00;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, La/m5l;->setAdditionalInformation(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La/k4l;->g:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, La/m5l;->setItems(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iget-byte p0, p0, La/k4l;->b:B

    .line 39
    .line 40
    int-to-long v0, p0

    .line 41
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, p1, La/m5l;->i:La/amw;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    iget-object p1, p1, La/m5l;->a:La/dc3;

    .line 53
    .line 54
    iget-object p1, p1, La/dc3;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Landroid/widget/HorizontalScrollView;

    .line 57
    .line 58
    invoke-virtual {v0, p0, p1}, La/amw;->a(Ljava/lang/String;Landroid/widget/HorizontalScrollView;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-byte p0, p0, La/k4l;->b:B

    .line 68
    .line 69
    int-to-long v0, p0

    .line 70
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v0, p1, La/m5l;->i:La/amw;

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    iget-object p1, p1, La/m5l;->a:La/dc3;

    .line 82
    .line 83
    iget-object p1, p1, La/dc3;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Landroid/widget/HorizontalScrollView;

    .line 86
    .line 87
    invoke-virtual {v0, p0, p1}, La/amw;->b(Ljava/lang/String;Landroid/widget/HorizontalScrollView;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

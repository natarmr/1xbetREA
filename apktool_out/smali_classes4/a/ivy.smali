.class public final synthetic La/ivy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g9b0;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/g9b0;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ivy;->a:B

    iput-object p1, p0, La/ivy;->b:La/g9b0;

    iput-object p2, p0, La/ivy;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ivy;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ivy;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/ivy;->b:La/g9b0;

    .line 6
    .line 7
    check-cast p1, La/cp;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v2, p1, La/xhe0;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v0, La/zga0;

    .line 21
    .line 22
    invoke-direct {v0, p0, v1, p1}, La/zga0;-><init>(La/g9b0;Ljava/lang/String;La/cp;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p1, La/cp;->w:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const v1, 0x7f0704be

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const v0, 0x7f0706f8

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/4 v6, 0x0

    .line 53
    const/16 v7, 0x8

    .line 54
    .line 55
    move v5, v3

    .line 56
    invoke-static/range {v2 .. v7}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/ui80;

    .line 60
    .line 61
    const/16 v0, 0xb

    .line 62
    .line 63
    invoke-direct {p0, p1, v0}, La/ui80;-><init>(La/cp;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_0
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v2, La/c5t;

    .line 78
    .line 79
    const/4 v3, 0x3

    .line 80
    invoke-direct {v2, v3, p1, p0, v1}, La/c5t;-><init>(BLa/cp;La/g9b0;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v2}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 84
    .line 85
    .line 86
    new-instance p0, La/b1w;

    .line 87
    .line 88
    const/16 v0, 0xd

    .line 89
    .line 90
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La/h1x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z6e;

.field public final synthetic c:La/z6e;

.field public final synthetic d:La/z6e;


# direct methods
.method public synthetic constructor <init>(La/z6e;La/z6e;La/z6e;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/h1x;->a:B

    iput-object p1, p0, La/h1x;->b:La/z6e;

    iput-object p2, p0, La/h1x;->c:La/z6e;

    iput-object p3, p0, La/h1x;->d:La/z6e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/h1x;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, La/h1x;->d:La/z6e;

    .line 5
    .line 6
    iget-object v3, p0, La/h1x;->c:La/z6e;

    .line 7
    .line 8
    iget-object p0, p0, La/h1x;->b:La/z6e;

    .line 9
    .line 10
    check-cast p1, La/cp;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 19
    .line 20
    check-cast v0, La/c2k;

    .line 21
    .line 22
    iget-object v4, v0, La/c2k;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    iget-object v5, p1, La/cp;->w:Landroid/content/Context;

    .line 31
    .line 32
    const v6, 0x7f040afc

    .line 33
    .line 34
    .line 35
    invoke-static {v4, v5, v6}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v4, v0, La/c2k;->b:Landroid/widget/ImageView;

    .line 39
    .line 40
    new-instance v5, La/pzp;

    .line 41
    .line 42
    const/4 v6, 0x3

    .line 43
    invoke-direct {v5, p1, p0, v6}, La/pzp;-><init>(La/cp;La/z6e;B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, La/c2k;->a:Landroid/widget/LinearLayout;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v4, La/lfr;

    .line 55
    .line 56
    const/16 v5, 0xa

    .line 57
    .line 58
    invoke-direct {v4, p0, v0, v5}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v4}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    new-instance p0, La/l1d;

    .line 65
    .line 66
    invoke-direct {p0, p1, v3, v2, v1}, La/l1d;-><init>(La/cp;La/z6e;La/z6e;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 79
    .line 80
    check-cast v0, La/b2k;

    .line 81
    .line 82
    iget-object v4, v0, La/b2k;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 83
    .line 84
    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-eqz v4, :cond_1

    .line 89
    .line 90
    iget-object v5, p1, La/cp;->w:Landroid/content/Context;

    .line 91
    .line 92
    const v6, 0x7f040ae3

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v5, v6}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 96
    .line 97
    .line 98
    :cond_1
    iget-object v4, v0, La/b2k;->c:Landroid/widget/ImageView;

    .line 99
    .line 100
    new-instance v5, La/pzp;

    .line 101
    .line 102
    invoke-direct {v5, p0, p1, v1}, La/pzp;-><init>(La/z6e;La/cp;B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, v0, La/b2k;->a:Landroid/widget/LinearLayout;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v1, La/mfr;

    .line 114
    .line 115
    const/4 v4, 0x7

    .line 116
    invoke-direct {v1, p0, v0, v4}, La/mfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    invoke-static {p0, v1}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 120
    .line 121
    .line 122
    new-instance p0, La/l1d;

    .line 123
    .line 124
    const/4 v0, 0x1

    .line 125
    invoke-direct {p0, p1, v3, v2, v0}, La/l1d;-><init>(La/cp;La/z6e;La/z6e;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

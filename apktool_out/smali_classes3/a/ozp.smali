.class public final synthetic La/ozp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z6e;

.field public final synthetic c:La/enc;


# direct methods
.method public synthetic constructor <init>(La/z6e;La/enc;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ozp;->a:B

    iput-object p1, p0, La/ozp;->b:La/z6e;

    iput-object p2, p0, La/ozp;->c:La/enc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ozp;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ozp;->c:La/enc;

    .line 4
    .line 5
    iget-object p0, p0, La/ozp;->b:La/z6e;

    .line 6
    .line 7
    check-cast p1, La/cp;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 16
    .line 17
    check-cast v0, La/a2k;

    .line 18
    .line 19
    iget-object v2, v0, La/a2k;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v3, p1, La/cp;->w:Landroid/content/Context;

    .line 28
    .line 29
    const v4, 0x7f040afc

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3, v4}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, v0, La/a2k;->c:Landroid/widget/ImageView;

    .line 36
    .line 37
    new-instance v2, La/pzp;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-direct {v2, p1, p0, v3}, La/pzp;-><init>(La/cp;La/z6e;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    .line 45
    .line 46
    new-instance p0, La/qzp;

    .line 47
    .line 48
    invoke-direct {p0, p1, v1, v3}, La/qzp;-><init>(La/cp;La/enc;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 61
    .line 62
    check-cast v0, La/z1k;

    .line 63
    .line 64
    iget-object v2, v0, La/z1k;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    iget-object v3, p1, La/cp;->w:Landroid/content/Context;

    .line 73
    .line 74
    const v4, 0x7f040ae3

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v3, v4}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v0, v0, La/z1k;->d:Landroid/widget/ImageView;

    .line 81
    .line 82
    new-instance v2, La/pzp;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-direct {v2, p0, p1, v3}, La/pzp;-><init>(La/z6e;La/cp;B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    new-instance p0, La/qzp;

    .line 92
    .line 93
    invoke-direct {p0, p1, v1, v3}, La/qzp;-><init>(La/cp;La/enc;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La/utf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/due0;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/due0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/utf0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/utf0;->c:La/cp;

    iput-object p2, p0, La/utf0;->b:La/due0;

    return-void
.end method

.method public synthetic constructor <init>(La/due0;La/cp;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/utf0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/utf0;->b:La/due0;

    iput-object p2, p0, La/utf0;->c:La/cp;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/utf0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/utf0;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/utf0;->b:La/due0;

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
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, v1, La/cp;->u:La/yfu0;

    .line 20
    .line 21
    check-cast v0, La/axx;

    .line 22
    .line 23
    iget-object v0, v0, La/axx;->a:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, La/due0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p1, v1, La/cp;->u:La/yfu0;

    .line 48
    .line 49
    move-object v0, p1

    .line 50
    check-cast v0, La/axx;

    .line 51
    .line 52
    iget-object v0, v0, La/axx;->a:Landroid/widget/LinearLayout;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v2, La/utf0;

    .line 58
    .line 59
    invoke-direct {v2, p0, v1}, La/utf0;-><init>(La/due0;La/cp;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v2}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 63
    .line 64
    .line 65
    check-cast p1, La/axx;

    .line 66
    .line 67
    iget-object p0, p1, La/axx;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 68
    .line 69
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/zvf0;

    .line 74
    .line 75
    iget v0, v0, La/zvf0;->a:I

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p1, La/axx;->c:Landroid/widget/TextView;

    .line 81
    .line 82
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, La/zvf0;

    .line 87
    .line 88
    iget p1, p1, La/zvf0;->b:I

    .line 89
    .line 90
    invoke-virtual {v1, p1}, La/cp;->v(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

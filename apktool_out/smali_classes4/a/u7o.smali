.class public final synthetic La/u7o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/owr0;


# direct methods
.method public synthetic constructor <init>(La/owr0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/u7o;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u7o;->c:La/owr0;

    iput-object p2, p0, La/u7o;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/owr0;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/u7o;->a:B

    iput-object p1, p0, La/u7o;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/u7o;->c:La/owr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/u7o;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/u7o;->c:La/owr0;

    .line 4
    .line 5
    iget-object p0, p0, La/u7o;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/owr0;

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
    check-cast p1, Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    check-cast p1, La/es10;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, p1, La/es10;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v2, La/u7o;

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-direct {v2, p0, v1, v3}, La/u7o;-><init>(Lkotlin/jvm/functions/Function1;La/owr0;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 49
    .line 50
    .line 51
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 52
    .line 53
    iget-object v2, p1, La/es10;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 54
    .line 55
    iget-object v3, v1, La/owr0;->d:Ljava/lang/String;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    const/16 v9, 0x1fe

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    invoke-static/range {v2 .. v9}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p1, La/es10;->d:Landroid/widget/TextView;

    .line 68
    .line 69
    iget-object v0, v1, La/owr0;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    iget-object p0, p1, La/es10;->c:Landroid/widget/TextView;

    .line 75
    .line 76
    iget-object p1, v1, La/owr0;->c:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

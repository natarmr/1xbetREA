.class public final synthetic La/e4l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f4l0;


# direct methods
.method public synthetic constructor <init>(La/f4l0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e4l0;->a:B

    iput-object p1, p0, La/e4l0;->b:La/f4l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/e4l0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/e4l0;->b:La/f4l0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, La/bte;

    .line 10
    .line 11
    iget v1, p0, La/f4l0;->e:I

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, La/bte;-><init>(Landroid/view/ViewGroup;I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, La/yte;

    .line 23
    .line 24
    const v1, 0x7f140844

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0, v1}, La/yte;-><init>(Landroid/view/ViewGroup;I)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    new-instance v0, La/eue;

    .line 37
    .line 38
    const v2, 0x7fffffff

    .line 39
    .line 40
    .line 41
    const v3, 0x7f140476

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v2, v1, v3, p0}, La/eue;-><init>(IIILandroid/view/View;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_2
    new-instance v0, La/eue;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    const v3, 0x7f14046f

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v2, v1, v3, p0}, La/eue;-><init>(IIILandroid/view/View;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_3
    new-instance v0, La/od5;

    .line 59
    .line 60
    invoke-direct {v0, p0}, La/od5;-><init>(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

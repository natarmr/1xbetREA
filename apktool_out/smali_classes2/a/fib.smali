.class public final synthetic La/fib;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fib;->a:B

    iput-object p1, p0, La/fib;->b:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    iput p2, p0, La/fib;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fib;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/fib;->c:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object p0, p0, La/fib;->b:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 22
    .line 23
    invoke-static {p0, p1, p2}, La/y0x0;->j(Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;La/fet;I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    iget p2, p0, La/fib;->c:I

    .line 30
    .line 31
    or-int/lit8 p2, p2, 0x1

    .line 32
    .line 33
    invoke-static {p2}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget-object p0, p0, La/fib;->b:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 38
    .line 39
    invoke-static {p0, p1, p2}, La/m0x0;->l(Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;La/fet;I)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    iget p2, p0, La/fib;->c:I

    .line 46
    .line 47
    or-int/lit8 p2, p2, 0x1

    .line 48
    .line 49
    invoke-static {p2}, La/x8x;->L(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    iget-object p0, p0, La/fib;->b:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 54
    .line 55
    invoke-static {p0, p1, p2}, La/qjj;->k(Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;La/fet;I)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

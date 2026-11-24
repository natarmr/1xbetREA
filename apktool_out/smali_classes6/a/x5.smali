.class public final synthetic La/x5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x5;->a:B

    iput-object p1, p0, La/x5;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-byte p1, p0, La/x5;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x5;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lru/ok/android/sdk/OkAuthActivity;

    .line 9
    .line 10
    sget p1, Lru/ok/android/sdk/OkAuthActivity;->i:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lru/ok/android/sdk/OkAuthActivity;->a()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;

    .line 17
    .line 18
    sget p1, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->Z:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->s()La/uo4;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance p2, La/to4;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {p2, p0, v1, v0}, La/to4;-><init>(La/uo4;La/yje;B)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x3

    .line 36
    invoke-static {p1, v1, v1, p2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    check-cast p0, La/b8a;

    .line 41
    .line 42
    iget-object p0, p0, La/b8a;->a:Lcom/journeyapps/barcodescanner/CaptureActivity;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_2
    check-cast p0, La/a6;

    .line 49
    .line 50
    const p1, 0x7f0a1440

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Landroid/webkit/WebView;

    .line 58
    .line 59
    invoke-virtual {p0}, La/a6;->d()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

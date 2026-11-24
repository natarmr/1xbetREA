.class public final synthetic La/g02;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zkz;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g02;->a:B

    iput-object p1, p0, La/g02;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final l(La/clz;La/kkz;)V
    .locals 1

    .line 1
    iget-byte p1, p0, La/g02;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p0, p0, La/g02;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/x1;

    .line 10
    .line 11
    sget-object p1, La/kkz;->ON_DESTROY:La/kkz;

    .line 12
    .line 13
    if-ne p2, p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/x1;->e()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :pswitch_0
    check-cast p0, La/h0h0;

    .line 20
    .line 21
    sget-object p1, La/kkz;->ON_START:La/kkz;

    .line 22
    .line 23
    if-ne p2, p1, :cond_1

    .line 24
    .line 25
    iput-boolean v0, p0, La/h0h0;->h:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object p1, La/kkz;->ON_STOP:La/kkz;

    .line 29
    .line 30
    if-ne p2, p1, :cond_2

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, La/h0h0;->h:Z

    .line 34
    .line 35
    :cond_2
    :goto_0
    return-void

    .line 36
    :pswitch_1
    check-cast p0, La/wjd;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, La/kkz;->a()La/lkz;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, La/wjd;->b:La/lkz;

    .line 46
    .line 47
    invoke-virtual {p0}, La/wjd;->a()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_2
    check-cast p0, La/ck60;

    .line 52
    .line 53
    sget-object p1, La/kkz;->ON_RESUME:La/kkz;

    .line 54
    .line 55
    if-ne p2, p1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, La/ck60;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_3
    return-void

    .line 61
    :pswitch_3
    check-cast p0, La/ax0;

    .line 62
    .line 63
    iget-object p0, p0, La/ax0;->a:Landroid/webkit/WebView;

    .line 64
    .line 65
    sget-object p1, La/h02;->a:[I

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    aget p1, p1, p2

    .line 72
    .line 73
    if-eq p1, v0, :cond_5

    .line 74
    .line 75
    const/4 p2, 0x2

    .line 76
    if-eq p1, p2, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    if-eqz p0, :cond_6

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/webkit/WebView;->onPause()V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    if-eqz p0, :cond_6

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/webkit/WebView;->onResume()V

    .line 88
    .line 89
    .line 90
    :cond_6
    :goto_1
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

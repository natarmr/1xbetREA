.class public final synthetic La/pyb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qyb0;


# direct methods
.method public synthetic constructor <init>(La/qyb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pyb0;->a:B

    iput-object p1, p0, La/pyb0;->b:La/qyb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pyb0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/pyb0;->b:La/qyb0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/qyb0;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p0}, La/m7x;->J(Landroid/content/Context;)La/ryb0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, La/qyb0;->e:La/n0o0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/ryb0;

    .line 22
    .line 23
    iget-object p0, p0, La/ryb0;->a:Ljava/lang/String;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

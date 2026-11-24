.class public final synthetic La/i5c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l5c;


# direct methods
.method public synthetic constructor <init>(La/l5c;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i5c;->a:B

    iput-object p1, p0, La/i5c;->b:La/l5c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i5c;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/i5c;->b:La/l5c;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroid/view/View;

    .line 9
    .line 10
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/l5c;->I0()La/v7c;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/vm4;->d:La/vm4;

    .line 20
    .line 21
    sget-object v0, La/q64;->d:La/q64;

    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, La/v7c;->H(La/vm4;La/q64;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/v7c;->P:La/ol60;

    .line 27
    .line 28
    sget-object p1, La/y6c;->a:La/y6c;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, La/iqt0;

    .line 37
    .line 38
    sget-object v0, La/l5c;->W1:La/kl5;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/l5c;->I0()La/v7c;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object p0, p0, La/v7c;->D:La/z4w0;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/z4w0;->a(La/iqt0;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

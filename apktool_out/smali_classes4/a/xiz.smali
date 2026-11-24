.class public final synthetic La/xiz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yiz;


# direct methods
.method public synthetic constructor <init>(La/yiz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xiz;->a:B

    iput-object p1, p0, La/xiz;->b:La/yiz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xiz;->a:B

    .line 2
    .line 3
    sget-object v1, La/br70;->a:La/br70;

    .line 4
    .line 5
    iget-object p0, p0, La/xiz;->b:La/yiz;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/er70;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, v1}, La/er70;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/yiz;->i(La/fr70;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance v0, La/er70;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, v1}, La/er70;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, La/yiz;->i(La/fr70;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, v1}, La/yiz;->i(La/fr70;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_2
    invoke-virtual {p0, v1}, La/yiz;->i(La/fr70;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_3
    sget-object v0, La/zq70;->a:La/zq70;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, La/yiz;->i(La/fr70;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_4
    sget-object v0, La/ar70;->a:La/ar70;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/yiz;->i(La/fr70;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_5
    sget-object v0, La/dr70;->a:La/dr70;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, La/yiz;->i(La/fr70;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

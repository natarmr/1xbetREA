.class public final synthetic La/e790;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j790;


# direct methods
.method public synthetic constructor <init>(La/j790;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e790;->a:B

    iput-object p1, p0, La/e790;->b:La/j790;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/e790;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/e790;->b:La/j790;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/j790;->v:La/duj;

    .line 14
    .line 15
    new-instance v1, La/f790;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v1, p0, v2}, La/f790;-><init>(La/j790;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La/j790;->v:La/duj;

    .line 31
    .line 32
    new-instance v0, La/ht80;

    .line 33
    .line 34
    const/16 v1, 0xa

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/ht80;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/j790;->v:La/duj;

    .line 49
    .line 50
    new-instance v1, La/f790;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-direct {v1, p0, v2}, La/f790;-><init>(La/j790;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

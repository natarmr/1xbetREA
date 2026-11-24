.class public final synthetic La/dai0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jai0;


# direct methods
.method public synthetic constructor <init>(La/jai0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dai0;->a:B

    iput-object p1, p0, La/dai0;->b:La/jai0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/dai0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/dai0;->b:La/jai0;

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
    iget-object p0, p0, La/jai0;->g:La/duj;

    .line 14
    .line 15
    new-instance v0, La/d1i0;

    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    invoke-direct {v0, v1}, La/d1i0;-><init>(B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

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
    iget-object v0, p0, La/jai0;->g:La/duj;

    .line 31
    .line 32
    new-instance v1, La/uph0;

    .line 33
    .line 34
    const/16 v2, 0xc

    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

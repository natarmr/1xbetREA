.class public final synthetic La/h7j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o7j;


# direct methods
.method public synthetic constructor <init>(La/o7j;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h7j;->a:B

    iput-object p1, p0, La/h7j;->b:La/o7j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/h7j;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/h7j;->b:La/o7j;

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
    new-instance v0, La/j7j;

    .line 14
    .line 15
    invoke-virtual {p0}, La/o7j;->w()La/jkm;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, La/j7j;-><init>(La/jkm;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/o7j;->y(La/m7j;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/o7j;->e:La/duj;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, La/j7j;

    .line 37
    .line 38
    invoke-virtual {p0}, La/o7j;->w()La/jkm;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, La/j7j;-><init>(La/jkm;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/o7j;->y(La/m7j;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/o7j;->e:La/duj;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

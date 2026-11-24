.class public final synthetic La/v8o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/p6t0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v8o;->a:B

    iput-object p1, p0, La/v8o;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/v8o;->c:La/p6t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/v8o;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/v8o;->c:La/p6t0;

    .line 4
    .line 5
    iget-object p0, p0, La/v8o;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/m8m;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p1, La/ifz;

    .line 16
    .line 17
    check-cast v1, La/jhz;

    .line 18
    .line 19
    iget-wide v2, v1, La/jhz;->b:J

    .line 20
    .line 21
    iget-object v0, v1, La/jhz;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v1, v1, La/jhz;->d:Z

    .line 24
    .line 25
    invoke-direct {p1, v0, v2, v3, v1}, La/ifz;-><init>(Ljava/lang/String;JZ)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, La/o5s0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance p1, La/p7o;

    .line 40
    .line 41
    check-cast v1, La/o5s0;

    .line 42
    .line 43
    invoke-direct {p1, v1}, La/p7o;-><init>(La/o5s0;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

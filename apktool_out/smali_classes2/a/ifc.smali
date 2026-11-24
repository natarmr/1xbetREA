.class public final synthetic La/ifc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pkk0;


# direct methods
.method public synthetic constructor <init>(La/pkk0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ifc;->a:B

    iput-object p1, p0, La/ifc;->b:La/pkk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ifc;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ifc;->b:La/pkk0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    check-cast p0, La/r3k;

    .line 11
    .line 12
    invoke-virtual {p0}, La/r3k;->a()V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    sget-object v0, La/xfh0;->V1:La/cge0;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    check-cast p0, La/r3k;

    .line 23
    .line 24
    invoke-virtual {p0}, La/r3k;->a()V

    .line 25
    .line 26
    .line 27
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    if-eqz p0, :cond_2

    .line 31
    .line 32
    check-cast p0, La/r3k;

    .line 33
    .line 34
    invoke-virtual {p0}, La/r3k;->a()V

    .line 35
    .line 36
    .line 37
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

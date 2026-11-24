.class public final synthetic La/p1i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o4i;


# direct methods
.method public synthetic constructor <init>(La/o4i;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p1i;->a:B

    iput-object p1, p0, La/p1i;->b:La/o4i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/p1i;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/p1i;->b:La/o4i;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/u6n;

    .line 9
    .line 10
    sget-object v1, La/d4d;->t:La/d4d;

    .line 11
    .line 12
    sget-object v2, La/w6n;->j:La/w6n;

    .line 13
    .line 14
    iget-object p0, p0, La/o4i;->c:La/c280;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, La/u6n;

    .line 21
    .line 22
    sget-object v1, La/d4d;->t:La/d4d;

    .line 23
    .line 24
    sget-object v2, La/w6n;->j:La/w6n;

    .line 25
    .line 26
    iget-object p0, p0, La/o4i;->b:La/c280;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, La/u6n;

    .line 33
    .line 34
    sget-object v1, La/d4d;->t:La/d4d;

    .line 35
    .line 36
    sget-object v2, La/w6n;->j:La/w6n;

    .line 37
    .line 38
    iget-object p0, p0, La/o4i;->c:La/c280;

    .line 39
    .line 40
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_2
    new-instance v0, La/u6n;

    .line 45
    .line 46
    sget-object v1, La/d4d;->t:La/d4d;

    .line 47
    .line 48
    sget-object v2, La/w6n;->j:La/w6n;

    .line 49
    .line 50
    iget-object p0, p0, La/o4i;->b:La/c280;

    .line 51
    .line 52
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

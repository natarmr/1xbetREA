.class public final synthetic La/mhs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zhs0;


# direct methods
.method public synthetic constructor <init>(La/zhs0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mhs0;->a:B

    iput-object p1, p0, La/mhs0;->b:La/zhs0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/mhs0;->a:B

    .line 2
    .line 3
    const v1, 0x7f0809ae

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/mhs0;->b:La/zhs0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, La/u6n;

    .line 12
    .line 13
    sget-object v2, La/d4d;->t:La/d4d;

    .line 14
    .line 15
    sget-object v3, La/w6n;->h:La/w6n;

    .line 16
    .line 17
    new-instance v4, La/c280;

    .line 18
    .line 19
    iget-object p0, p0, La/zhs0;->i:Ljava/lang/String;

    .line 20
    .line 21
    invoke-direct {v4, p0, v1}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v2, v3, v4}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    new-instance v0, La/u6n;

    .line 29
    .line 30
    sget-object v2, La/d4d;->t:La/d4d;

    .line 31
    .line 32
    sget-object v3, La/w6n;->h:La/w6n;

    .line 33
    .line 34
    new-instance v4, La/c280;

    .line 35
    .line 36
    iget-object p0, p0, La/zhs0;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {v4, p0, v1}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v2, v3, v4}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    new-instance v0, La/u6n;

    .line 46
    .line 47
    sget-object v2, La/d4d;->t:La/d4d;

    .line 48
    .line 49
    sget-object v3, La/w6n;->c:La/w6n;

    .line 50
    .line 51
    new-instance v4, La/c280;

    .line 52
    .line 53
    iget-object p0, p0, La/zhs0;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v4, p0, v1}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v2, v3, v4}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

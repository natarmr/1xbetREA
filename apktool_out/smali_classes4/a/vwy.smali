.class public final synthetic La/vwy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zeb;


# direct methods
.method public synthetic constructor <init>(La/zeb;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vwy;->a:B

    iput-object p1, p0, La/vwy;->b:La/zeb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/vwy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/vwy;->b:La/zeb;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v3, p1

    .line 11
    check-cast v3, La/hcz;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object p1, La/y9a;->d:La/ugd;

    .line 17
    .line 18
    invoke-static {v3, v2, v2, p1, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 19
    .line 20
    .line 21
    iget-byte v4, p0, La/zeb;->a:B

    .line 22
    .line 23
    sget-object v7, La/y9a;->e:La/ugd;

    .line 24
    .line 25
    const/4 v8, 0x6

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-static/range {v3 .. v8}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    move-object v0, p1

    .line 35
    check-cast v0, La/hcz;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object p1, La/j2e;->c:La/ugd;

    .line 41
    .line 42
    invoke-static {v0, v2, v2, p1, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 43
    .line 44
    .line 45
    iget-byte v1, p0, La/zeb;->a:B

    .line 46
    .line 47
    sget-object v4, La/j2e;->d:La/ugd;

    .line 48
    .line 49
    const/4 v5, 0x6

    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    move-object v0, p1

    .line 59
    check-cast v0, La/hcz;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object p1, La/cwr0;->c:La/ugd;

    .line 65
    .line 66
    invoke-static {v0, v2, v2, p1, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 67
    .line 68
    .line 69
    iget-byte v1, p0, La/zeb;->a:B

    .line 70
    .line 71
    sget-object v4, La/cwr0;->d:La/ugd;

    .line 72
    .line 73
    const/4 v5, 0x6

    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

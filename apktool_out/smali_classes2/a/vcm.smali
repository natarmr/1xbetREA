.class public final synthetic La/vcm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:La/ucm;


# direct methods
.method public synthetic constructor <init>(La/xdr;La/ucm;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vcm;->a:B

    iput-object p1, p0, La/vcm;->b:La/xdr;

    iput-object p2, p0, La/vcm;->c:La/ucm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/vcm;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/vcm;->c:La/ucm;

    .line 4
    .line 5
    iget-object p0, p0, La/vcm;->b:La/xdr;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-wide v2, v1, La/ucm;->a:J

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, v1, La/ucm;->c:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v1, v1, La/ucm;->e:Z

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    iget-wide v2, v1, La/ucm;->a:J

    .line 31
    .line 32
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v2, v1, La/ucm;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-boolean v1, v1, La/ucm;->e:Z

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {p0, v0, v2, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La/ru20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(La/xdr;JLjava/lang/String;ZB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/ru20;->a:B

    iput-object p1, p0, La/ru20;->b:La/xdr;

    iput-wide p2, p0, La/ru20;->c:J

    iput-object p4, p0, La/ru20;->d:Ljava/lang/String;

    iput-boolean p5, p0, La/ru20;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ru20;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, La/ru20;->c:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-boolean v1, p0, La/ru20;->e:Z

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, La/ru20;->b:La/xdr;

    .line 19
    .line 20
    iget-object p0, p0, La/ru20;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {v2, v0, p0, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    new-instance v0, La/ru20;

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    iget-object v1, p0, La/ru20;->b:La/xdr;

    .line 32
    .line 33
    iget-wide v2, p0, La/ru20;->c:J

    .line 34
    .line 35
    iget-object v4, p0, La/ru20;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget-boolean v5, p0, La/ru20;->e:Z

    .line 38
    .line 39
    invoke-direct/range {v0 .. v6}, La/ru20;-><init>(La/xdr;JLjava/lang/String;ZB)V

    .line 40
    .line 41
    .line 42
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 43
    .line 44
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, La/bjj;->a()V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

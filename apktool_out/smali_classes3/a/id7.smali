.class public final synthetic La/id7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/id7;->a:B

    iput-object p1, p0, La/id7;->b:Ljava/lang/String;

    iput-wide p2, p0, La/id7;->c:J

    iput-wide p4, p0, La/id7;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/id7;->a:B

    .line 2
    .line 3
    iget-wide v1, p0, La/id7;->d:J

    .line 4
    .line 5
    iget-wide v3, p0, La/id7;->c:J

    .line 6
    .line 7
    iget-object p0, p0, La/id7;->b:Ljava/lang/String;

    .line 8
    .line 9
    check-cast p1, La/n1g;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p0}, La/n1g;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-wide v3, p1, La/n1g;->c:J

    .line 18
    .line 19
    iput-wide v1, p1, La/n1g;->b:J

    .line 20
    .line 21
    sget-object p0, La/j1g;->c:La/j1g;

    .line 22
    .line 23
    iput-object p0, p1, La/n1g;->d:La/j1g;

    .line 24
    .line 25
    new-instance p0, La/dq2;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 31
    .line 32
    sget-object p0, La/l1g;->b:La/l1g;

    .line 33
    .line 34
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 35
    .line 36
    sget-object p0, La/k1g;->b:La/k1g;

    .line 37
    .line 38
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    invoke-virtual {p1, p0}, La/n1g;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-wide v3, p1, La/n1g;->c:J

    .line 47
    .line 48
    iput-wide v1, p1, La/n1g;->b:J

    .line 49
    .line 50
    sget-object p0, La/j1g;->c:La/j1g;

    .line 51
    .line 52
    iput-object p0, p1, La/n1g;->d:La/j1g;

    .line 53
    .line 54
    new-instance p0, La/dq2;

    .line 55
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 60
    .line 61
    sget-object p0, La/l1g;->b:La/l1g;

    .line 62
    .line 63
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 64
    .line 65
    sget-object p0, La/k1g;->b:La/k1g;

    .line 66
    .line 67
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

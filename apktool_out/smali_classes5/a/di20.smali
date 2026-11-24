.class public final synthetic La/di20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/nn20;

.field public final synthetic d:J

.field public final synthetic e:La/l1g;

.field public final synthetic f:La/j1g;

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(JLa/nn20;JLa/l1g;La/j1g;JB)V
    .locals 0

    .line 1
    iput-byte p10, p0, La/di20;->a:B

    iput-wide p1, p0, La/di20;->b:J

    iput-object p3, p0, La/di20;->c:La/nn20;

    iput-wide p4, p0, La/di20;->d:J

    iput-object p6, p0, La/di20;->e:La/l1g;

    iput-object p7, p0, La/di20;->f:La/j1g;

    iput-wide p8, p0, La/di20;->g:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/di20;->a:B

    .line 2
    .line 3
    iget-wide v1, p0, La/di20;->g:J

    .line 4
    .line 5
    iget-object v3, p0, La/di20;->f:La/j1g;

    .line 6
    .line 7
    iget-object v4, p0, La/di20;->e:La/l1g;

    .line 8
    .line 9
    iget-wide v5, p0, La/di20;->d:J

    .line 10
    .line 11
    iget-object v7, p0, La/di20;->c:La/nn20;

    .line 12
    .line 13
    iget-wide v8, p0, La/di20;->b:J

    .line 14
    .line 15
    check-cast p1, La/n1g;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1, p0}, La/n1g;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, v7, La/nn20;->p:La/ms2;

    .line 31
    .line 32
    invoke-virtual {p1, p0}, La/n1g;->a(La/ms2;)V

    .line 33
    .line 34
    .line 35
    iput-wide v5, p1, La/n1g;->c:J

    .line 36
    .line 37
    invoke-virtual {p1, v4}, La/n1g;->c(La/l1g;)V

    .line 38
    .line 39
    .line 40
    iput-object v3, p1, La/n1g;->d:La/j1g;

    .line 41
    .line 42
    iput-wide v1, p1, La/n1g;->b:J

    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p1, p0}, La/n1g;->b(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, v7, La/nn20;->p:La/ms2;

    .line 58
    .line 59
    invoke-virtual {p1, p0}, La/n1g;->a(La/ms2;)V

    .line 60
    .line 61
    .line 62
    iput-wide v5, p1, La/n1g;->c:J

    .line 63
    .line 64
    invoke-virtual {p1, v4}, La/n1g;->c(La/l1g;)V

    .line 65
    .line 66
    .line 67
    iput-object v3, p1, La/n1g;->d:La/j1g;

    .line 68
    .line 69
    iput-wide v1, p1, La/n1g;->b:J

    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

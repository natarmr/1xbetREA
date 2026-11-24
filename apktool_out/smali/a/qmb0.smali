.class public final synthetic La/qmb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/lie0;

.field public final synthetic b:La/rmb0;

.field public final synthetic c:La/mkx;

.field public final synthetic d:J

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(La/lie0;La/rmb0;La/mkx;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qmb0;->a:La/lie0;

    iput-object p2, p0, La/qmb0;->b:La/rmb0;

    iput-object p3, p0, La/qmb0;->c:La/mkx;

    iput-wide p4, p0, La/qmb0;->d:J

    iput-wide p6, p0, La/qmb0;->e:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/qmb0;->b:La/rmb0;

    .line 2
    .line 3
    iget-object v1, v0, La/rmb0;->r:La/vmb0;

    .line 4
    .line 5
    iget-object v5, v0, La/rmb0;->s:La/k6z;

    .line 6
    .line 7
    iget-object v2, p0, La/qmb0;->c:La/mkx;

    .line 8
    .line 9
    iget-wide v3, p0, La/qmb0;->d:J

    .line 10
    .line 11
    iget-wide v6, p0, La/qmb0;->e:J

    .line 12
    .line 13
    invoke-interface/range {v1 .. v7}, La/vmb0;->a(La/mkx;JLa/k6z;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-object p0, p0, La/qmb0;->a:La/lie0;

    .line 18
    .line 19
    iput-wide v0, p0, La/lie0;->a:J

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0
.end method

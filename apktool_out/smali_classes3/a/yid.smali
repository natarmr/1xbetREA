.class public final synthetic La/yid;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:La/hjd;

.field public final synthetic d:La/j1g;

.field public final synthetic e:La/l1g;

.field public final synthetic f:La/d0t;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLa/hjd;La/j1g;La/l1g;La/d0t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yid;->a:Ljava/lang/String;

    iput-wide p2, p0, La/yid;->b:J

    iput-object p4, p0, La/yid;->c:La/hjd;

    iput-object p5, p0, La/yid;->d:La/j1g;

    iput-object p6, p0, La/yid;->e:La/l1g;

    iput-object p7, p0, La/yid;->f:La/d0t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/n1g;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/yid;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, La/n1g;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-wide v0, p0, La/yid;->b:J

    .line 12
    .line 13
    iput-wide v0, p1, La/n1g;->c:J

    .line 14
    .line 15
    iget-object v0, p0, La/yid;->c:La/hjd;

    .line 16
    .line 17
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/tjd;

    .line 22
    .line 23
    iget-object v0, v0, La/tjd;->b:La/ms2;

    .line 24
    .line 25
    iput-object v0, p1, La/n1g;->e:La/ms2;

    .line 26
    .line 27
    iget-object v0, p0, La/yid;->d:La/j1g;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iput-object v0, p1, La/n1g;->d:La/j1g;

    .line 33
    .line 34
    iget-object v0, p0, La/yid;->e:La/l1g;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, La/n1g;->c(La/l1g;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/yid;->f:La/d0t;

    .line 40
    .line 41
    iget-wide v0, p0, La/d0t;->n:J

    .line 42
    .line 43
    iput-wide v0, p1, La/n1g;->b:J

    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0
.end method

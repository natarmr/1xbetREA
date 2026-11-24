.class public final La/lg60;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/qni0;

.field public final b:La/pbt;


# direct methods
.method public constructor <init>(La/qni0;La/pbt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/lg60;->a:La/qni0;

    .line 8
    .line 9
    iput-object p2, p0, La/lg60;->b:La/pbt;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(D)V
    .locals 1

    .line 1
    iget-object v0, p0, La/lg60;->a:La/qni0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, La/qni0;->a(D)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/lg60;->b:La/pbt;

    .line 7
    .line 8
    iget-object p0, p0, La/pbt;->a:La/j5t;

    .line 9
    .line 10
    iput-wide p1, p0, La/j5t;->n:D

    .line 11
    .line 12
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "localBalanceDiff"

    .line 17
    .line 18
    invoke-static {p0, p1}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

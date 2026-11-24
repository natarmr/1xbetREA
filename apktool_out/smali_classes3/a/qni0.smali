.class public final La/qni0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qni0;->a:La/pbt;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(D)V
    .locals 0

    .line 1
    iget-object p0, p0, La/qni0;->a:La/pbt;

    .line 2
    .line 3
    iget-object p0, p0, La/pbt;->a:La/j5t;

    .line 4
    .line 5
    iput-wide p1, p0, La/j5t;->o:D

    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "betSum"

    .line 12
    .line 13
    invoke-static {p0, p1}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

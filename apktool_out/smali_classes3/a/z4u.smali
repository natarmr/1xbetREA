.class public final La/z4u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/wti;

.field public final b:La/ntu;


# direct methods
.method public constructor <init>(La/wti;La/ntu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z4u;->a:La/wti;

    .line 5
    .line 6
    iput-object p2, p0, La/z4u;->b:La/ntu;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(JLa/yje;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/z4u;->b:La/ntu;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ntu;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, La/z4u;->a:La/wti;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, v0, p3}, La/wti;->n(JLjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

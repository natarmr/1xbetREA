.class public final La/gmi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/h760;


# instance fields
.field public final a:La/us00;

.field public final b:La/q7d0;

.field public final c:La/us3;

.field public final d:La/kl5;


# direct methods
.method public constructor <init>(La/us00;La/q7d0;La/us3;La/kl5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gmi;->a:La/us00;

    .line 5
    .line 6
    iput-object p2, p0, La/gmi;->b:La/q7d0;

    .line 7
    .line 8
    iput-object p3, p0, La/gmi;->c:La/us3;

    .line 9
    .line 10
    iput-object p4, p0, La/gmi;->d:La/kl5;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()La/t760;
    .locals 7

    .line 1
    new-instance v0, La/u760;

    .line 2
    .line 3
    new-instance v1, La/x4u;

    .line 4
    .line 5
    new-instance v2, La/jm3;

    .line 6
    .line 7
    iget-object v3, p0, La/gmi;->b:La/q7d0;

    .line 8
    .line 9
    iget-object v4, p0, La/gmi;->c:La/us3;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    invoke-direct {v2, v3, v4, v5}, La/jm3;-><init>(La/q7d0;La/us3;B)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, La/x4u;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, La/e1u;

    .line 19
    .line 20
    new-instance v6, La/jm3;

    .line 21
    .line 22
    invoke-direct {v6, v3, v4, v5}, La/jm3;-><init>(La/q7d0;La/us3;B)V

    .line 23
    .line 24
    .line 25
    const/16 v3, 0x1c

    .line 26
    .line 27
    invoke-direct {v2, v6, v3}, La/e1u;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, La/gmi;->d:La/kl5;

    .line 31
    .line 32
    iget-object p0, p0, La/gmi;->a:La/us00;

    .line 33
    .line 34
    invoke-direct {v0, p0, v1, v2, v3}, La/u760;-><init>(La/us00;La/x4u;La/e1u;La/kl5;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

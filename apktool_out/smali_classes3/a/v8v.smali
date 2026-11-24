.class public final La/v8v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ir30;

.field public final b:La/ir30;


# direct methods
.method public constructor <init>(La/mne;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ir30;

    .line 5
    .line 6
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 7
    .line 8
    const-wide/32 v1, 0x1d4c0

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1, v2}, La/ir30;-><init>(La/lne;J)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/v8v;->a:La/ir30;

    .line 15
    .line 16
    new-instance v0, La/ir30;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1, v2}, La/ir30;-><init>(La/lne;J)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/v8v;->b:La/ir30;

    .line 22
    .line 23
    return-void
.end method

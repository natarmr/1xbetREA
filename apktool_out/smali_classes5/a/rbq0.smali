.class public final La/rbq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:La/mne;

.field public final c:La/n0o0;

.field public final d:La/ol60;

.field public e:La/bby;


# direct methods
.method public constructor <init>(La/us00;La/mne;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rbq0;->a:La/us00;

    .line 5
    .line 6
    iput-object p2, p0, La/rbq0;->b:La/mne;

    .line 7
    .line 8
    new-instance p1, La/h3q0;

    .line 9
    .line 10
    const/16 p2, 0x8

    .line 11
    .line 12
    invoke-direct {p1, p0, p2}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La/rbq0;->c:La/n0o0;

    .line 20
    .line 21
    new-instance p1, La/ol60;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    sget-object v0, La/i99;->b:La/i99;

    .line 25
    .line 26
    invoke-direct {p1, p2, v0}, La/ol60;-><init>(ILa/i99;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/rbq0;->d:La/ol60;

    .line 30
    .line 31
    return-void
.end method

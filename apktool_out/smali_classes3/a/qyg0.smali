.class public final La/qyg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rwc;


# direct methods
.method public constructor <init>(La/rwc;)V
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
    iput-object p1, p0, La/qyg0;->a:La/rwc;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p0, p0, La/qyg0;->a:La/rwc;

    .line 2
    .line 3
    iget-object v0, p0, La/rwc;->g:La/q7d0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "FIRST_SAVE_SEEN_BANNER_TIMESTAMP"

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    cmp-long v0, v4, v2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, La/rwc;->g:La/q7d0;

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-virtual {v0, v1, v2, v3}, La/q7d0;->f(Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, La/rwc;->c:La/nhf0;

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, La/nhf0;->A(ILa/zje;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, La/wne;->a:La/wne;

    .line 37
    .line 38
    if-ne p0, p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    :goto_0
    if-ne p0, p1, :cond_2

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0
.end method

.class public final La/rwi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/xvi;


# direct methods
.method public constructor <init>(La/xvi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rwi;->a:La/xvi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 7

    .line 1
    new-instance v0, La/xup0;

    .line 2
    .line 3
    iget-object p0, p0, La/rwi;->a:La/xvi;

    .line 4
    .line 5
    iget-object p0, p0, La/xvi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/swi;

    .line 8
    .line 9
    iget-object v1, p0, La/swi;->a:La/n660;

    .line 10
    .line 11
    iget-object v1, v1, La/n660;->c:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, La/ctf0;

    .line 15
    .line 16
    invoke-static {v2}, La/x1x;->y(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, La/swi;->b:La/nr00;

    .line 20
    .line 21
    iget-object v1, v1, La/nr00;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/es;

    .line 24
    .line 25
    new-instance v3, La/d8c;

    .line 26
    .line 27
    invoke-virtual {v1}, La/es;->E()La/cyu;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v3, v1}, La/d8c;-><init>(La/cyu;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, La/swi;->a:La/n660;

    .line 35
    .line 36
    iget-object v4, v1, La/n660;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, La/rpt;

    .line 39
    .line 40
    iget-object v1, v1, La/n660;->b:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v5, v1

    .line 43
    check-cast v5, La/mne;

    .line 44
    .line 45
    iget-object v6, p0, La/swi;->c:Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;

    .line 46
    .line 47
    move-object v1, p1

    .line 48
    invoke-direct/range {v0 .. v6}, La/xup0;-><init>(La/vzg0;La/ctf0;La/d8c;La/rpt;La/mne;Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method

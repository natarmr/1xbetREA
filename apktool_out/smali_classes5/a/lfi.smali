.class public final La/lfi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/yei;


# direct methods
.method public constructor <init>(La/yei;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lfi;->a:La/yei;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 8

    .line 1
    new-instance v0, La/txk;

    .line 2
    .line 3
    iget-object p0, p0, La/lfi;->a:La/yei;

    .line 4
    .line 5
    iget-object p0, p0, La/yei;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/mfi;

    .line 8
    .line 9
    iget-object v1, p0, La/mfi;->a:La/kxk;

    .line 10
    .line 11
    new-instance v2, La/rpt;

    .line 12
    .line 13
    new-instance v3, La/pmi;

    .line 14
    .line 15
    new-instance v4, La/lrc;

    .line 16
    .line 17
    iget-object v5, p0, La/mfi;->b:La/gii0;

    .line 18
    .line 19
    invoke-direct {v4, v5}, La/lrc;-><init>(La/gii0;)V

    .line 20
    .line 21
    .line 22
    new-instance v5, La/iyk;

    .line 23
    .line 24
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v6, v5, La/iyk;->a:Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    iget-object v6, p0, La/mfi;->c:La/knf0;

    .line 35
    .line 36
    iget-object v7, p0, La/mfi;->d:La/mne;

    .line 37
    .line 38
    invoke-direct {v3, v4, v5, v6, v7}, La/pmi;-><init>(La/lrc;La/iyk;La/knf0;La/mne;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, v3}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, p0, La/mfi;->d:La/mne;

    .line 45
    .line 46
    iget-object v4, p0, La/mfi;->e:La/ctf0;

    .line 47
    .line 48
    move-object v5, p1

    .line 49
    invoke-direct/range {v0 .. v5}, La/txk;-><init>(La/kxk;La/rpt;La/mne;La/ctf0;La/vzg0;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.class public final La/khi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/ugi;


# direct methods
.method public constructor <init>(La/ugi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/khi;->a:La/ugi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 8

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/vkr;

    .line 5
    .line 6
    iget-object p0, p0, La/khi;->a:La/ugi;

    .line 7
    .line 8
    iget-object p0, p0, La/ugi;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/esg0;

    .line 11
    .line 12
    new-instance v2, La/rpt;

    .line 13
    .line 14
    invoke-virtual {p0}, La/esg0;->O()La/pmi;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v2, p1}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, La/ani0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/esg0;->O()La/pmi;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v3, p1}, La/ani0;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v4, La/lef0;

    .line 31
    .line 32
    invoke-virtual {p0}, La/esg0;->O()La/pmi;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v4, p1}, La/lef0;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance v5, La/i8u;

    .line 40
    .line 41
    invoke-virtual {p0}, La/esg0;->O()La/pmi;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v5, p1}, La/i8u;-><init>(La/pmi;)V

    .line 46
    .line 47
    .line 48
    new-instance v6, La/i8u;

    .line 49
    .line 50
    invoke-virtual {p0}, La/esg0;->O()La/pmi;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {v6, p1}, La/i8u;-><init>(La/pmi;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v7, p0

    .line 60
    check-cast v7, La/duj;

    .line 61
    .line 62
    invoke-direct/range {v0 .. v7}, La/vkr;-><init>(La/i1w0;La/rpt;La/ani0;La/lef0;La/i8u;La/i8u;La/duj;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

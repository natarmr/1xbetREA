.class public final La/sqi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/ppi;


# direct methods
.method public constructor <init>(La/ppi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sqi;->a:La/ppi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 10

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/fkd0;

    .line 5
    .line 6
    iget-object p0, p0, La/sqi;->a:La/ppi;

    .line 7
    .line 8
    iget-object p0, p0, La/ppi;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/tqi;

    .line 11
    .line 12
    iget-object v2, p0, La/tqi;->a:Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 13
    .line 14
    iget-object v3, p0, La/tqi;->b:La/duj;

    .line 15
    .line 16
    iget-object p1, p0, La/tqi;->c:La/lef0;

    .line 17
    .line 18
    iget-object p1, p1, La/lef0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, La/gbi;

    .line 21
    .line 22
    invoke-virtual {p1}, La/gbi;->y()La/n5c;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, La/tqi;->d:La/mne;

    .line 27
    .line 28
    iget-object v6, p0, La/tqi;->e:La/rou;

    .line 29
    .line 30
    iget-object v7, p0, La/tqi;->f:La/m1e;

    .line 31
    .line 32
    iget-object p1, p0, La/tqi;->c:La/lef0;

    .line 33
    .line 34
    iget-object p1, p1, La/lef0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, La/gbi;

    .line 37
    .line 38
    invoke-virtual {p1}, La/gbi;->c()La/wpt;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    iget-object v9, p0, La/tqi;->g:La/s64;

    .line 43
    .line 44
    invoke-direct/range {v0 .. v9}, La/fkd0;-><init>(La/i1w0;Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;La/duj;La/n5c;La/mne;La/rou;La/m1e;La/wpt;La/s64;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

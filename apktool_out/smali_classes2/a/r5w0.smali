.class public final La/r5w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/wsb0;

.field public final b:La/n0o0;


# direct methods
.method public constructor <init>(La/wsb0;La/akh0;La/vby;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/r5w0;->a:La/wsb0;

    .line 5
    .line 6
    new-instance p1, La/ugu0;

    .line 7
    .line 8
    const/16 v0, 0xc

    .line 9
    .line 10
    invoke-direct {p1, p2, p3, v0}, La/ugu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/r5w0;->b:La/n0o0;

    .line 18
    .line 19
    new-instance p0, La/o5w0;

    .line 20
    .line 21
    new-instance p0, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 22
    .line 23
    sget-object p1, Ljava/security/spec/MGF1ParameterSpec;->SHA512:Ljava/security/spec/MGF1ParameterSpec;

    .line 24
    .line 25
    sget-object p2, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    .line 26
    .line 27
    const-string p3, "SHA-512"

    .line 28
    .line 29
    const-string v0, "MGF1"

    .line 30
    .line 31
    invoke-direct {p0, p3, v0, p1, p2}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

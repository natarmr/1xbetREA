.class public final La/vpb;
.super La/da0;
.source "SourceFile"


# instance fields
.field public final synthetic b:La/xpb;


# direct methods
.method public constructor <init>(La/xpb;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vpb;->b:La/xpb;

    .line 2
    .line 3
    invoke-direct {p0}, La/da0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/xpb;->S1:La/gl5;

    .line 5
    .line 6
    iget-object p0, p0, La/vpb;->b:La/xpb;

    .line 7
    .line 8
    invoke-virtual {p0}, La/xpb;->H0()La/eqb;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, La/eqb;->A(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

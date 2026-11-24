.class public final La/d9i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:La/ctf0;

.field public final c:Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;

.field public final d:La/n5d0;


# direct methods
.method public constructor <init>(La/mne;Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;La/ctf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/d9i;->a:La/mne;

    .line 5
    .line 6
    iput-object p3, p0, La/d9i;->b:La/ctf0;

    .line 7
    .line 8
    iput-object p2, p0, La/d9i;->c:Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;

    .line 9
    .line 10
    new-instance p1, La/n8i;

    .line 11
    .line 12
    const/16 p2, 0xb

    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, La/n8i;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/d9i;->d:La/n5d0;

    .line 22
    .line 23
    return-void
.end method
